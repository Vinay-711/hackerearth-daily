from pathlib import Path
import tempfile,subprocess,collections,random
rng=random.Random(711)
cases=[[1,1,2,2,4],[10**15],[1,2,3,4],[7]*200000,list(range(1,200001))]
cases += [[rng.randint(1,9) for _ in range(n)] for n in [2,3,10,51,1000]]
with tempfile.TemporaryDirectory() as d:
    subprocess.run(['javac','-d',d,str(Path(__file__).with_name('Main.java'))],check=True)
    for a in cases:
        counts=collections.Counter(a); m=max(counts.values())
        expected=sum(v==m for v in counts.values())
        r=subprocess.run(['java','-cp',d,'Main'],input=str(len(a))+'\n'+' '.join(map(str,a)),text=True,capture_output=True,check=True,timeout=10)
        assert int(r.stdout)==expected
print(f'{len(cases)} independent cases passed, including 200000 entries and 64-bit IDs')

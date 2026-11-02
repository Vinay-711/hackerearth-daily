from pathlib import Path
import subprocess,tempfile,random
rng=random.Random(711)
cases=[[85,25,65,21,84],[0],[10],[11],[1,20],[100000]*100000]
cases += [[rng.randrange(100001) for _ in range(n)] for n in [2,9,100]]
with tempfile.TemporaryDirectory() as d:
    subprocess.run(['javac','-d',d,str(Path(__file__).with_name('Main.java'))],check=True)
    for a in cases:
        expected=('Yes' if (int(''.join(str(v%10) for v in a))%10==0) else 'No') if len(a)<1000 else 'Yes'
        r=subprocess.run(['java','-cp',d,'Main'],input=str(len(a))+'\n'+' '.join(map(str,a)),text=True,capture_output=True,check=True,timeout=10)
        assert r.stdout.strip()==expected
print('9 sample, zero, randomized and maximum-size cases passed')

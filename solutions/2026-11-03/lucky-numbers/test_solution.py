from pathlib import Path
import importlib.util,itertools,bisect,subprocess
p=Path(__file__).parent
spec=importlib.util.spec_from_file_location('solution',p/'solution.py');s=importlib.util.module_from_spec(spec);spec.loader.exec_module(s)
allowed=sorted(int(''.join(x)) for n in range(1,7) for x in itertools.product('13579',repeat=n))
for n in range(1,100001):
 i=bisect.bisect_left(allowed,n);choices=allowed[max(0,i-1):i+1];want=min(choices,key=lambda x:(abs(x-n),x));assert s.nearest(n)==want,(n,s.nearest(n),want)
for n,w in [(6,5),(1,1),(2,1),(10,9),(1000,999),(10**18,10**18-1),(999999999999999999,999999999999999999),(888888888888888888,911111111111111111)]:
 assert s.nearest(n)==w,(n,s.nearest(n),w)
r=subprocess.run(['python3',str(p/'solution.py')],input='6',text=True,capture_output=True,check=True);assert r.stdout.strip()=='5'
print('100000 independent enumerated-number comparisons plus 18/19-digit boundaries and CLI passed')

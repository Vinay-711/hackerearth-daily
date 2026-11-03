from pathlib import Path
import tempfile,subprocess
p=Path(__file__).parent
cases=[('5\nH...H\n', 'YES\nHBBBH'), ('1\nH', 'YES\nH'), ('1\n.', 'YES\nB'), ('4\n.HH.', 'NO'), ('5\nH.H.H', 'YES\nHBHBH'), ('3\n...', 'YES\nBBB')]
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 for data,want in cases:
  r=subprocess.run(['java','-cp',d,'Main'],input=data,text=True,capture_output=True,check=True,timeout=5)
  assert r.stdout.strip()==want.strip(),(data,r.stdout,want)
print(str(len(cases))+' sample and original edge checks passed')

import importlib.util
spec=importlib.util.spec_from_file_location('split_houses',p/'solution.py')
module=importlib.util.module_from_spec(spec);spec.loader.exec_module(module)
for data,want in cases: assert module.solve(data).strip()==want.strip()
# Every layout through length 10: any adjacent pair is impossible;
# otherwise every house is isolated, and every blank is fenced.
import itertools
for n in range(1,11):
 for chars in itertools.product('H.',repeat=n):
  v=''.join(chars);result=module.solve(str(n)+'\n'+v)
  if 'HH' in v: assert result=='NO'
  else:
   prefix,fenced=result.split('\n'); assert prefix=='YES'
   assert fenced==v.replace('.','B') and '..' not in fenced and '.' not in fenced
print('Python fallback: examples and 2046 exhaustive village layouts passed')

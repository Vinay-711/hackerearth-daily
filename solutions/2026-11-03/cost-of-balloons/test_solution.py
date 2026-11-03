from pathlib import Path
import importlib.util
p=Path(__file__).parent
spec=importlib.util.spec_from_file_location('solution_under_test',p/'solution.py')
m=importlib.util.module_from_spec(spec);spec.loader.exec_module(m)
sample="""2
9 6
10
1 1
1 1
0 1
0 0
0 1
0 0
0 1
0 1
1 1
0 0
1 9
10
0 1
0 0
0 0
0 1
1 0
0 1
0 1
0 0
0 1
0 0
"""
assert m.solve(sample)=="69\n14"
assert m.solve('3\n7 2\n1\n0 0\n3 3\n1\n1 1\n9 1\n1\n1 0')=='0\n6\n1'
checks=0
for a in range(1,11):
 for b in range(1,11):
  for x in range(11):
   for y in range(11):
    expected=min(a,b)*max(x,y)+max(a,b)*min(x,y)
    assert m.minimum_cost(a,b,x,y)==expected
    checks+=1
print('Sample, zero-solve and '+str(checks)+' independent assignment checks passed')

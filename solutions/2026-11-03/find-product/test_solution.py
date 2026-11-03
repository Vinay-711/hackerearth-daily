from pathlib import Path
import importlib.util
p=Path(__file__).parent
spec=importlib.util.spec_from_file_location('solution_under_test',p/'solution.py')
m=importlib.util.module_from_spec(spec);spec.loader.exec_module(m)
import math,random
assert m.solve('5\n1 2 3 4 5')=='120'
assert m.solve('1\n1')=='1'
assert m.solve('1\n1000')=='1000'
assert m.solve('1000\n'+'1000 '*1000)==str(pow(1000,1000,m.MOD))
rng=random.Random(711)
for _ in range(150):
 a=[rng.randint(1,1000) for _ in range(rng.randint(1,1000))]
 assert m.solve(str(len(a))+'\n'+' '.join(map(str,a)))==str(math.prod(a)%m.MOD)
print('Sample, singleton, maximum input and 150 exact-integer oracle comparisons passed')

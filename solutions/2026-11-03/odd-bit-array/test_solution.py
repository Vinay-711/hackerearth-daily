from pathlib import Path
import subprocess,random
p=Path(__file__).parent
rng=random.Random(21)
cases=[([1,6,10],1),([1,4,6,8,8],4),([0],0),([1],1)]
for _ in range(200):
 n=rng.randint(1,12);a=[rng.randrange(64) for _ in range(n)];want=0
 for mask in range(1<<(n-1)):
  part=0;ok=True
  for i,x in enumerate(a):
   part^=x
   if i==n-1 or mask&(1<<i):
    if part.bit_count()%2==0:ok=False;break
    part=0
  want+=ok
 cases.append((a,want))
a=[0]*100000;cases.append((a,0))
data=str(len(cases))+"\n"+"\n".join(str(len(a))+"\n"+" ".join(map(str,a)) for a,_ in cases)
r=subprocess.run(['python3',str(p/'solution.py')],input=data,text=True,capture_output=True,check=True,timeout=8)
assert list(map(int,r.stdout.split()))==[w for _,w in cases],r.stdout
print('205 sample, exhaustive-partition reference and maximum-size checks passed')

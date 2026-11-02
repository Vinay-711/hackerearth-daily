from pathlib import Path
import subprocess,tempfile
cases=[('zzzoooooo','Yes'),('zoo','Yes'),('zzoooo','Yes'),('zzooo','No'),('zzzooooo','No'),('z'+'o'*19,'No'),('z'*6+'o'*12,'Yes')]
with tempfile.TemporaryDirectory() as d:
    subprocess.run(['javac','-d',d,str(Path(__file__).with_name('Main.java'))],check=True)
    for word,expected in cases:
        r=subprocess.run(['java','-cp',d,'Main'],input=word+'\n',text=True,capture_output=True,check=True)
        assert r.stdout.strip()==expected
print('7 sample and boundary cases passed')

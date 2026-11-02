// AI-assisted archived practice solution.
import java.io.*;
import java.util.*;
class Main {
    static class FastInput {
        private final InputStream in = System.in;
        private final byte[] buf = new byte[1 << 16];
        private int pos, len;
        int read() throws IOException {
            if (pos == len) { len = in.read(buf); pos = 0; if (len < 0) return -1; }
            return buf[pos++];
        }
        long nextLong() throws IOException {
            int c; do { c=read(); } while(c<=32 && c!=-1);
            long v=0; while(c>32 && c!=-1) { v=v*10+c-'0'; c=read(); }
            return v;
        }
    }
    public static void main(String[] args) throws Exception {
        FastInput in=new FastInput(); int n=(int)in.nextLong();
        Map<Long,Integer> counts=new HashMap<>();
        for(int i=0;i<n;i++) { long id=in.nextLong(); counts.merge(id,1,Integer::sum); }
        int maximum=0, answer=0;
        for(int count:counts.values()) {
            if(count>maximum) {maximum=count; answer=1;}
            else if(count==maximum) answer++;
        }
        System.out.println(answer);
    }
}

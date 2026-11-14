import java.io.*;
import java.util.*;

public class TestClass {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    static int[] bit = new int[10005];
    static int[] countAtStrength = new int[10005];
    static int totalAlive = 0;

    static void update(int idx, int val) {
        idx++;
        for (; idx < bit.length; idx += idx & -idx) {
            bit[idx] += val;
        }
    }

    static int query(int idx) {
        idx++;
        int sum = 0;
        for (; idx > 0; idx -= idx & -idx) {
            sum += bit[idx];
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        String tStr = fr.next();
        if (tStr == null) return;
        int T = Integer.parseInt(tStr);
        while (T-- > 0) {
            int N = fr.nextInt();
            Arrays.fill(bit, 0);
            Arrays.fill(countAtStrength, 0);
            totalAlive = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                int s = fr.nextInt();
                int killed = query(s);
                if (killed > 0) {
                    for (int j = 0; j <= s; j++) {
                        if (countAtStrength[j] > 0) {
                            update(j, -countAtStrength[j]);
                            totalAlive -= countAtStrength[j];
                            countAtStrength[j] = 0;
                        }
                    }
                }
                update(s, 1);
                countAtStrength[s]++;
                totalAlive++;
                sb.append(totalAlive).append(i == N - 1 ? "" : " ");
            }
            out.println(sb.toString());
        }
        out.flush();
        out.close();
    }
}
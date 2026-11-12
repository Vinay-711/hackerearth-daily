import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class TestClass {
    private static final long INF = Long.MAX_VALUE / 2;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == -1) return;

        int[] head = new int[n + 1];
        Arrays.fill(head, -1);
        int[] to = new int[2 * m];
        int[] next = new int[2 * m];
        long[] weight = new long[2 * m];
        int edgeCount = 0;

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            long w = sc.nextLong();

            to[edgeCount] = v;
            weight[edgeCount] = w;
            next[edgeCount] = head[u];
            head[u] = edgeCount++;

            to[edgeCount] = u;
            weight[edgeCount] = w;
            next[edgeCount] = head[v];
            head[v] = edgeCount++;
        }

        long[] prev = new long[n + 1];
        long[] minDist = new long[n + 1];
        Arrays.fill(prev, INF);
        Arrays.fill(minDist, INF);

        prev[1] = 0;
        minDist[1] = 0;

        for (int L = 1; L < n; L++) {
            long[] curr = new long[n + 1];
            Arrays.fill(curr, INF);
            boolean anyReachable = false;

            for (int u = 1; u <= n; u++) {
                if (prev[u] == INF) continue;
                anyReachable = true;

                for (int e = head[u]; e != -1; e = next[e]) {
                    int v = to[e];
                    long w = weight[e];
                    long newCost = prev[u] + (long) L * w;
                    if (newCost < curr[v]) {
                        curr[v] = newCost;
                    }
                }
            }

            if (!anyReachable) {
                break;
            }

            for (int u = 1; u <= n; u++) {
                if (curr[u] < minDist[u]) {
                    minDist[u] = curr[u];
                }
            }

            prev = curr;
        }

        PrintWriter out = new PrintWriter(System.out);
        for (int i = 1; i <= n; i++) {
            if (minDist[i] == INF) {
                out.println("-1");
            } else {
                out.println(minDist[i]);
            }
        }
        out.flush();
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[32768];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return buflen > 0;
        }

        private int readByte() {
            return hasNextByte() ? buffer[ptr++] : -1;
        }

        public int nextInt() {
            int b = readByte();
            while (b <= 32 && b != -1) b = readByte();
            if (b == -1) return -1;
            int res = 0;
            while (b >= '0' && b <= '9') {
                res = res * 10 + (b - '0');
                b = readByte();
            }
            return res;
        }

        public long nextLong() {
            int b = readByte();
            while (b <= 32 && b != -1) b = readByte();
            if (b == -1) return -1;
            long res = 0;
            while (b >= '0' && b <= '9') {
                res = res * 10 + (b - '0');
                b = readByte();
            }
            return res;
        }
    }
}
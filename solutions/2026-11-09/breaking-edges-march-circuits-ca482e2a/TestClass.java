import java.io.*;
import java.util.*;

public class TestClass {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[65536];
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
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        public int nextInt() {
            int b = readByte();
            while (b <= 32) {
                if (b == -1) return -1;
                b = readByte();
            }
            int res = 0;
            while (b > 32) {
                if (b < '0' || b > '9') break;
                res = res * 10 + (b - '0');
                b = readByte();
            }
            return res;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        if (n <= 0) return;

        int[] values = new int[n + 1];
        int[] totalBits = new int[20];
        for (int i = 1; i <= n; i++) {
            values[i] = sc.nextInt();
            for (int b = 0; b < 20; b++) {
                if ((values[i] & (1 << b)) != 0) {
                    totalBits[b]++;
                }
            }
        }

        int[] head = new int[n + 1];
        Arrays.fill(head, -1);
        int[] to = new int[2 * n - 2];
        int[] next = new int[2 * n - 2];
        int edgeCount = 0;

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            to[edgeCount] = v;
            next[edgeCount] = head[u];
            head[u] = edgeCount++;
            to[edgeCount] = u;
            next[edgeCount] = head[v];
            head[v] = edgeCount++;
        }

        int[] order = new int[n + 1];
        int[] parent = new int[n + 1];
        boolean[] visited = new boolean[n + 1];

        int headIdx = 0, tailIdx = 0;
        order[tailIdx++] = 1;
        visited[1] = true;

        while (headIdx < tailIdx) {
            int u = order[headIdx++];
            for (int e = head[u]; e != -1; e = next[e]) {
                int v = to[e];
                if (!visited[v]) {
                    visited[v] = true;
                    parent[v] = u;
                    order[tailIdx++] = v;
                }
            }
        }

        int[][] bitCount = new int[n + 1][20];
        for (int i = 1; i <= n; i++) {
            for (int b = 0; b < 20; b++) {
                if ((values[i] & (1 << b)) != 0) {
                    bitCount[i][b] = 1;
                }
            }
        }

        int ans = 0;
        for (int i = n - 1; i >= 1; i--) {
            int u = order[i];
            int p = parent[u];

            boolean valid = true;
            for (int b = 0; b < 20; b++) {
                if (totalBits[b] > 0) {
                    if (bitCount[u][b] <= 0 || bitCount[u][b] >= totalBits[b]) {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid) {
                ans++;
            }

            for (int b = 0; b < 20; b++) {
                bitCount[p][b] += bitCount[u][b];
            }
        }

        System.out.println(ans);
    }
}
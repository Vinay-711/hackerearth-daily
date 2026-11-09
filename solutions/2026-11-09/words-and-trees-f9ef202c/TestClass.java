import java.io.*;
import java.util.*;

public class TestClass {
    static List<Integer>[] adj;
    static char[] nodeChars;
    static int[][] subtreeCounts;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        nodeChars = new char[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            nodeChars[i] = st.nextToken().charAt(0);
        }

        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        subtreeCounts = new int[n + 1][26];
        dfs(1, 0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int[] sCounts = new int[26];
            for (char c : s.toCharArray()) {
                sCounts[c - 'a']++;
            }
            int needed = 0;
            for (int j = 0; j < 26; j++) {
                if (sCounts[j] > subtreeCounts[x][j]) {
                    needed += (sCounts[j] - subtreeCounts[x][j]);
                }
            }
            sb.append(needed).append("\n");
        }
        System.out.print(sb);
    }

    static void dfs(int u, int p) {
        subtreeCounts[u][nodeChars[u] - 'a']++;
        for (int v : adj[u]) {
            if (v != p) {
                dfs(v, u);
                for (int i = 0; i < 26; i++) {
                    subtreeCounts[u][i] += subtreeCounts[v][i];
                }
            }
        }
    }
}
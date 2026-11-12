import java.io.*;
import java.util.*;

public class TestClass {
    static List<Integer>[] adj;
    static char[] nodeChars;
    static int[][] subtreeCounts;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        nodeChars = new char[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            nodeChars[i] = st.nextToken().charAt(0);
        }

        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<Integer>();
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
            for (int j = 0; j < s.length(); j++) {
                sCounts[s.charAt(j) - 'a']++;
            }
            int needed = 0;
            for (int j = 0; j < 26; j++) {
                if (sCounts[j] > subtreeCounts[x][j]) {
                    needed += (sCounts[j] - subtreeCounts[x][j]);
                }
            }
            sb.append(needed).append("\n");
        }
        System.out.print(sb.toString());
    }

    static void dfs(int u, int p) {
        subtreeCounts[u][nodeChars[u] - 'a']++;
        for (int i = 0; i < adj[u].size(); i++) {
            int v = adj[u].get(i);
            if (v != p) {
                dfs(v, u);
                for (int j = 0; j < 26; j++) {
                    subtreeCounts[u][j] += subtreeCounts[v][j];
                }
            }
        }
    }
}
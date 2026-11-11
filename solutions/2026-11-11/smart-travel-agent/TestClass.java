import java.util.*;
import java.io.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().trim().split("\\s+");
        int N = Integer.parseInt(line1[0]);
        int R = Integer.parseInt(line1[1]);
        int[][] adj = new int[N + 1][N + 1];
        for (int i = 0; i < R; i++) {
            String[] edge = br.readLine().trim().split("\\s+");
            int u = Integer.parseInt(edge[0]);
            int v = Integer.parseInt(edge[1]);
            int p = Integer.parseInt(edge[2]);
            adj[u][v] = Math.max(adj[u][v], p);
            adj[v][u] = Math.max(adj[v][u], p);
        }
        String[] lastLine = br.readLine().trim().split("\\s+");
        int S = Integer.parseInt(lastLine[0]);
        int D = Integer.parseInt(lastLine[1]);
        int T = Integer.parseInt(lastLine[2]);

        int[] maxCap = new int[N + 1];
        int[] parent = new int[N + 1];
        boolean[] visited = new boolean[N + 1];
        maxCap[S] = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int u = -1;
            for (int j = 1; j <= N; j++) {
                if (!visited[j] && (u == -1 || maxCap[j] > maxCap[u])) {
                    u = j;
                }
            }
            if (u == -1 || maxCap[u] == 0) break;
            visited[u] = true;
            for (int v = 1; v <= N; v++) {
                if (adj[u][v] > 0) {
                    int newCap = Math.min(maxCap[u], adj[u][v]);
                    if (newCap > maxCap[v]) {
                        maxCap[v] = newCap;
                        parent[v] = u;
                    } else if (newCap == maxCap[v]) {
                        if (isLexSmaller(v, u, parent)) {
                            parent[v] = u;
                        }
                    }
                }
            }
        }

        List<Integer> path = new ArrayList<>();
        for (int curr = D; curr != 0; curr = parent[curr]) path.add(curr);
        Collections.reverse(path);
        for (int i = 0; i < path.size(); i++) System.out.print(path.get(i) + (i == path.size() - 1 ? "" : " "));
        System.out.println();
        int capacity = maxCap[D] - 1;
        int trips = (int) Math.ceil((double) T / capacity);
        System.out.println(trips);
    }

    private static boolean isLexSmaller(int v, int newParent, int[] parent) {
        return false;
    }
}
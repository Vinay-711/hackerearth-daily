import java.io.*;
import java.util.*;

public class TestClass {
    static List<Integer>[] adj;
    static int[] depth;
    static long[] depthCount;
    static int[] A;
    static long totalTriplets = 0;
    static int N, M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) adj[i] = new ArrayList<Integer>();

        if (N > 1) {
            st = new StringTokenizer(br.readLine());
            for (int i = 2; i <= N; i++) {
                int p = Integer.parseInt(st.nextToken());
                adj[p].add(i);
            }
        }

        depth = new int[N + 1];
        depthCount = new long[N + 1];
        dfs(1, 0);
        System.out.println(totalTriplets);
    }

    static void dfs(int u, int d) {
        depth[u] = d;
        depthCount[d]++;

        for (int i = 0; i < M; i++) {
            int targetDepth = d - A[i];
            if (targetDepth >= 0 && targetDepth <= N) {
                totalTriplets += depthCount[targetDepth];
            }
        }

        for (int v : adj[u]) {
            dfs(v, d + 1);
        }

        depthCount[d]--;
    }
}
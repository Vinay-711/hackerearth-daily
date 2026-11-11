import java.io.*;
import java.util.*;

public class TestClass {
    static class Edge implements Comparable<Edge> {
        int u, v, w, id;
        public Edge(int u, int v, int w, int id) {
            if (u > v) { int t = u; u = v; v = t; }
            this.u = u; this.v = v; this.w = w; this.id = id;
        }
        public int compareTo(Edge o) { return Integer.compare(this.w, o.w); }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        Map<Long, Edge> edges = new HashMap<>();
        List<Edge> allEdges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            Edge e = new Edge(u, v, w, i);
            edges.put(getHash(e.u, e.v), e);
            allEdges.add(e);
        }
        long ans = 0;
        for (int q = 0; q < Q; q++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) + (int)(ans % 100);
            int b = Integer.parseInt(st.nextToken()) + (int)(ans % 100);
            int u = Integer.parseInt(st.nextToken()) + (int)(ans % 100);
            int v = Integer.parseInt(st.nextToken()) + (int)(ans % 100);
            int w = Integer.parseInt(st.nextToken()) + (int)(ans % 100);
            if (a > b) { int t = a; a = b; b = t; }
            edges.remove(getHash(a, b));
            Edge newEdge = new Edge(u, v, w, N + q);
            edges.put(getHash(u, v), newEdge);
            ans = calculateMST(N, edges.values());
            System.out.println(ans);
        }
    }

    private static long getHash(int u, int v) {
        return ((long) u << 32) | (v & 0xffffffffL);
    }

    private static long calculateMST(int n, Collection<Edge> edges) {
        List<Edge> sorted = new ArrayList<>(edges);
        Collections.sort(sorted);
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;
        long weight = 0;
        int count = 0;
        for (Edge e : sorted) {
            int rootU = find(parent, e.u);
            int rootV = find(parent, e.v);
            if (rootU != rootV) {
                parent[rootU] = rootV;
                weight += e.w;
                count++;
            }
        }
        return weight;
    }

    private static int find(int[] parent, int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent, parent[i]);
    }
}
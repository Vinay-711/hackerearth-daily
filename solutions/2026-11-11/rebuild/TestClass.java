import java.io.*;
import java.util.*;

public class TestClass {
    static class Edge implements Comparable<Edge> {
        int u, v, cost;
        public Edge(int u, int v, int cost) {
            this.u = Math.min(u, v);
            this.v = Math.max(u, v);
            this.cost = cost;
        }
        public int compareTo(Edge other) {
            if (this.cost != other.cost) return Long.compare(this.cost, other.cost);
            if (this.u != other.u) return Integer.compare(this.u, other.u);
            return Integer.compare(this.v, other.v);
        }
    }

    static class DSU {
        int[] parent;
        public DSU(int n) {
            parent = new int[n + 1];
            for (int i = 0; i <= n; i++) parent[i] = i;
        }
        public int find(int i) {
            if (parent[i] == i) return i;
            return parent[i] = find(parent[i]);
        }
        public boolean union(int i, int j) {
            int rootI = find(i);
            int rootJ = find(j);
            if (rootI != rootJ) {
                parent[rootI] = rootJ;
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int T = Integer.parseInt(line.trim());
        while (T-- > 0) {
            String[] nm = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            Edge[] edges = new Edge[m];
            for (int i = 0; i < m; i++) {
                String[] edgeData = br.readLine().trim().split("\\s+");
                edges[i] = new Edge(Integer.parseInt(edgeData[0]), Integer.parseInt(edgeData[1]), Integer.parseInt(edgeData[2]));
            }
            Arrays.sort(edges);
            DSU dsu = new DSU(n);
            long totalCost = 0;
            int[] degree = new int[n + 1];
            int edgesCount = 0;
            for (Edge e : edges) {
                if (dsu.union(e.u, e.v)) {
                    totalCost += e.cost;
                    degree[e.u]++;
                    degree[e.v]++;
                    edgesCount++;
                }
            }
            System.out.println(totalCost);
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                sb.append(degree[i]).append(i == n ? "" : " ");
            }
            System.out.println(sb.toString());
        }
    }
}
import java.io.*;
import java.util.*;

public class TestClass {
    static class Rock {
        long x, y, r;
        public Rock(long x, long y, long r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Rock[] rocks = new Rock[n];
            for (int i = 0; i < n; i++) {
                String[] parts = br.readLine().trim().split("\\s+");
                rocks[i] = new Rock(Long.parseLong(parts[0]), Long.parseLong(parts[1]), Long.parseLong(parts[2]));
            }
            String[] bounds = br.readLine().trim().split("\\s+");
            long A = Long.parseLong(bounds[0]);
            long B = Long.parseLong(bounds[1]);

            List<List<Integer>> adj = new ArrayList<>(n + 2);
            for (int i = 0; i < n + 2; i++) adj.add(new ArrayList<Integer>());

            int source = n, target = n + 1;
            for (int i = 0; i < n; i++) {
                if (Math.abs(rocks[i].y - B) <= rocks[i].r) adj.get(source).add(i);
                if (Math.abs(rocks[i].y - A) <= rocks[i].r) adj.get(i).add(target);
                for (int j = i + 1; j < n; j++) {
                    long dx = rocks[i].x - rocks[j].x;
                    long dy = rocks[i].y - rocks[j].y;
                    long distSq = dx * dx + dy * dy;
                    long rSum = rocks[i].r + rocks[j].r;
                    if (distSq <= rSum * rSum) {
                        adj.get(i).add(j);
                        adj.get(j).add(i);
                    }
                }
            }

            int[] dist = new int[n + 2];
            Arrays.fill(dist, -1);
            Queue<Integer> q = new LinkedList<>();
            q.add(source);
            dist[source] = 0;

            while (!q.isEmpty()) {
                int u = q.poll();
                for (int v : adj.get(u)) {
                    if (dist[v] == -1) {
                        dist[v] = dist[u] + 1;
                        q.add(v);
                    }
                }
            }
            if (dist[target] == -1) System.out.println(-1);
            else System.out.println(dist[target] - 1);
        }
    }
}
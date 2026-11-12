import java.util.*;
import java.io.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        if (line1 == null) return;
        StringTokenizer st1 = new StringTokenizer(line1);
        int startKey = Integer.parseInt(st1.nextToken());
        int targetKey = Integer.parseInt(st1.nextToken());
        
        String line2 = br.readLine();
        if (line2 == null) return;
        int n = Integer.parseInt(line2.trim());
        
        int[] keys = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            keys[i] = Integer.parseInt(st2.nextToken());
        }
        
        int[] dist = new int[100000];
        Arrays.fill(dist, -1);
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(startKey);
        dist[startKey] = 0;
        
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            
            if (curr == targetKey) {
                System.out.println(dist[curr]);
                return;
            }
            
            for (int i = 0; i < n; i++) {
                int next = (int) (((long) curr * keys[i]) % 100000);
                if (dist[next] == -1) {
                    dist[next] = dist[curr] + 1;
                    queue.add(next);
                }
            }
        }
        
        System.out.println(-1);
    }
}
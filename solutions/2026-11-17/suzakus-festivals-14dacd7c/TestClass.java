import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Map<String, PriorityQueue<Long>> map = new HashMap<String, PriorityQueue<Long>>();
            for (int i = 0; i < n; i++) {
                String[] parts = br.readLine().split(" ");
                String name = parts[0];
                long amount = Long.parseLong(parts[1]);
                if (!map.containsKey(name)) {
                    map.put(name, new PriorityQueue<Long>());
                }
                PriorityQueue<Long> pq = map.get(name);
                pq.add(amount);
                if (pq.size() > 3) {
                    pq.poll();
                }
            }
            String bestFestival = "";
            long maxSpending = -1;
            for (Map.Entry<String, PriorityQueue<Long>> entry : map.entrySet()) {
                String name = entry.getKey();
                PriorityQueue<Long> pq = entry.getValue();
                long currentSum = 0;
                for (Long val : pq) {
                    currentSum += val;
                }
                if (currentSum > maxSpending) {
                    maxSpending = currentSum;
                    bestFestival = name;
                } else if (currentSum == maxSpending) {
                    if (bestFestival.equals("") || name.compareTo(bestFestival) < 0) {
                        bestFestival = name;
                    }
                }
            }
            System.out.println(bestFestival + " " + maxSpending);
        }
    }
}
import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] parts = br.readLine().trim().split("\\s+");
        TreeMap<Integer, Integer> counts = new TreeMap<Integer, Integer>();
        int maxVal = -1;
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(parts[i]);
            counts.put(val, counts.getOrDefault(val, 0) + 1);
            if (val > maxVal) maxVal = val;
        }
        int q = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int val = Integer.parseInt(br.readLine().trim());
            int count = counts.getOrDefault(val, 0);
            if (count == 0) {
                counts.put(val, 1);
                if (val > maxVal) maxVal = val;
            } else if (count == 1 && val != maxVal) {
                counts.put(val, 2);
            }
            int currentSize = 0;
            for (int c : counts.values()) currentSize += c;
            sb.append(currentSize).append("\n");
        }
        List<Integer> inc = new ArrayList<Integer>();
        List<Integer> dec = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int val = entry.getKey();
            int count = entry.getValue();
            if (val == maxVal) {
                inc.add(val);
            } else {
                inc.add(val);
                if (count == 2) dec.add(val);
            }
        }
        Collections.reverse(dec);
        StringBuilder res = new StringBuilder();
        for (int x : inc) res.append(x).append(" ");
        for (int x : dec) res.append(x).append(" ");
        System.out.print(sb.toString());
        System.out.println(res.toString().trim());
    }
}
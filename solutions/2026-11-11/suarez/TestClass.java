import java.io.*;
import java.util.*;

public class TestClass {
    static class Segment {
        int l, r, size;
        Segment(int l, int r) {
            this.l = l;
            this.r = r;
            this.size = r - l + 1;
        }
    }

    static class Node {
        int[] sizes;
        Node left, right;
        Node(int[] sizes) { this.sizes = sizes; }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        Segment[] segs = new Segment[n];
        TreeSet<Integer> coords = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            int l = Integer.parseInt(parts[0]);
            int r = Integer.parseInt(parts[1]);
            segs[i] = new Segment(l, r);
            coords.add(l);
            coords.add(r);
        }
        List<Integer> sortedCoords = new ArrayList<Integer>(coords);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < sortedCoords.size(); i++) map.put(sortedCoords.get(i), i + 1);

        List<Integer>[] events = new List[sortedCoords.size() + 2];
        for (int i = 0; i < events.length; i++) events[i] = new ArrayList<Integer>();
        for (Segment s : segs) {
            int lIdx = map.get(s.l);
            int rIdx = map.get(s.r);
            for (int i = lIdx; i <= rIdx; i++) events[i].add(s.size);
        }
        for (int i = 0; i < events.length; i++) Collections.sort(events[i]);

        int q = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            String[] parts = br.readLine().split(" ");
            int k = Integer.parseInt(parts[0]);
            int x = Integer.parseInt(parts[1]);
            int pos = -1;
            Integer floor = coords.floor(x);
            Integer ceil = coords.ceiling(x);
            if (floor != null && ceil != null && floor.equals(ceil)) {
                pos = map.get(floor);
            } else if (floor != null && ceil != null) {
                pos = map.get(floor) + 1;
            }
            if (pos != -1 && pos < events.length && k <= events[pos].size()) {
                sb.append(events[pos].get(k - 1)).append("\n");
            } else {
                sb.append("-1\n");
            }
        }
        System.out.print(sb.toString());
    }
}
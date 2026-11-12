import java.util.*;
import java.io.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = readGrid(br);
        String blank = br.readLine();
        int target = readGrid(br);

        Queue<Integer> q = new LinkedList<>();
        Map<Integer, Integer> dist = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            int rotated = rotate(start, i);
            if (!dist.containsKey(rotated)) {
                dist.put(rotated, i);
                q.add(rotated);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.poll();
            int d = dist.get(curr);
            if (curr == target) {
                System.out.println(d);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int next = flipRow(curr, i);
                if (!dist.containsKey(next)) {
                    dist.put(next, d + 1);
                    q.add(next);
                }
                next = flipCol(curr, i);
                if (!dist.containsKey(next)) {
                    dist.put(next, d + 1);
                    q.add(next);
                }
            }
        }
        System.out.println(-1);
    }

    private static int readGrid(BufferedReader br) throws Exception {
        int mask = 0;
        for (int i = 0; i < 4; i++) {
            String line = br.readLine();
            if (line == null) break;
            for (int j = 0; j < 4; j++) {
                if (line.charAt(j) == '1') mask |= (1 << (i * 4 + j));
            }
        }
        return mask;
    }

    private static int rotate(int mask, int times) {
        for (int t = 0; t < times; t++) {
            int next = 0;
            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    if ((mask & (1 << (r * 4 + c))) != 0) {
                        next |= (1 << (c * 4 + (3 - r)));
                    }
                }
            }
            mask = next;
        }
        return mask;
    }

    private static int flipRow(int mask, int r) {
        for (int c = 0; c < 4; c++) mask ^= (1 << (r * 4 + c));
        return mask;
    }

    private static int flipCol(int mask, int c) {
        for (int r = 0; r < 4; r++) mask ^= (1 << (r * 4 + c));
        return mask;
    }
}
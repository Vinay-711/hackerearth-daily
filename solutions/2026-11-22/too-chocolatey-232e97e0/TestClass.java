import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String line = br.readLine();
        if (line == null || line.isEmpty()) {
            out.flush();
            return;
        }
        int T = Integer.parseInt(line.trim());
        for (int tc = 0; tc < T; tc++) {
            String nLine = br.readLine();
            while (nLine != null && nLine.trim().isEmpty()) {
                nLine = br.readLine();
            }
            if (nLine == null) break;
            int n = Integer.parseInt(nLine.trim());
            String[] parts = br.readLine().trim().split("\\s+");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            out.println(solve(n, arr));
        }
        out.flush();
    }

    static String solve(int n, int[] arr) {
        Integer[] sorted = new Integer[n];
        for (int i = 0; i < n; i++) sorted[i] = arr[i];
        Arrays.sort(sorted, Collections.reverseOrder());
        boolean[] alexTaken = new boolean[1001];
        boolean[] bobTaken = new boolean[1001];
        long alexSum = 0, bobSum = 0;
        boolean alexTurn = true;
        for (int val : sorted) {
            if (alexTurn) {
                if (!alexTaken[val]) {
                    alexTaken[val] = true;
                    alexSum += val;
                    alexTurn = false;
                }
            } else {
                if (!bobTaken[val]) {
                    bobTaken[val] = true;
                    bobSum += val;
                    alexTurn = true;
                }
            }
        }
        return alexSum > bobSum ? "Alex" : "Bob";
    }
}
import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        long[] A = new long[N];
        String[] parts = br.readLine().trim().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(parts[i]);
        }
        Arrays.sort(A);
        long[] prefix = new long[N + 1];
        for (int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + A[i];
        }
        int Q = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < Q; q++) {
            long K = Long.parseLong(br.readLine().trim());
            int low = 0, high = N;
            while (low < high) {
                int mid = (low + high + 1) / 2;
                if (prefix[mid] < (long) mid * K) {
                    low = mid;
                } else {
                    high = mid - 1;
                }
            }
            sb.append(low).append("\n");
        }
        System.out.print(sb.toString());
    }
}
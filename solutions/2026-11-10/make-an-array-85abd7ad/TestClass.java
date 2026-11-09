import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String line = br.readLine();
        if (line == null) return;
        int T = Integer.parseInt(line.trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split("\\s+");
            long[] A = new long[N];
            long sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = Long.parseLong(arr_A[i]);
                sum += A[i];
            }
            wr.println(solve(N, A, sum));
        }
        wr.flush();
        wr.close();
        br.close();
    }

    static long solve(int N, long[] A, long sum) {
        if (N == 1) return A[0];
        if (sum % (N - 1) != 0) return -1;
        long S = sum / (N - 1);
        for (int i = 0; i < N; i++) {
            if (S - A[i] < 0) return -1;
        }
        return S;
    }
}
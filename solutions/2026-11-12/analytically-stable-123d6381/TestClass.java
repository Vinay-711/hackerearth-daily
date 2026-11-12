import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String line = br.readLine();
        if (line != null) {
            int T = Integer.parseInt(line.trim());
            for (int t_i = 0; t_i < T; t_i++) {
                String N = br.readLine();
                if (N != null) {
                    wr.println(solve(N.trim()));
                }
            }
        }
        wr.flush();
        wr.close();
        br.close();
    }

    static long solve(String N) {
        long MOD = 1000000007L;
        long[] count = new long[10];
        long[] pair = new long[10];
        long[] triple = new long[10];
        long total = 0;

        for (int i = 0; i < N.length(); i++) {
            int d = N.charAt(i) - '0';

            if (d > 0) {
                total = (total + triple[d - 1] * count[d]) % MOD;
            }
            if (d < 9) {
                total = (total + pair[d + 1] * pair[d]) % MOD;
            }

            if (d < 9) {
                triple[d] = (triple[d] + pair[d] * count[d + 1]) % MOD;
            }
            if (d > 0) {
                triple[d - 1] = (triple[d - 1] + pair[d - 1] * count[d]) % MOD;
            }

            pair[d] = (pair[d] + count[d]) % MOD;
            count[d] = (count[d] + 1) % MOD;
        }
        return total;
    }
}
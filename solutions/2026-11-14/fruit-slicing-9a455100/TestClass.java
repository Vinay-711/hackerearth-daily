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
            String nLine = br.readLine();
            if (nLine == null) break;
            int N = Integer.parseInt(nLine.trim());
            String[] arr_A = br.readLine().split("\\s+");
            long[] A = new long[N];
            for (int i_A = 0; i_A < N; i_A++) {
                A[i_A] = Long.parseLong(arr_A[i_A]);
            }

            int out_ = solve(N, A);
            wr.println(out_);
        }
        wr.flush();
        wr.close();
        br.close();
    }

    static int solve(int N, long[] A) {
        Set<Long> uniqueWeights = new HashSet<Long>();
        for (int i = 0; i < N; i++) {
            uniqueWeights.add(A[i]);
        }
        return uniqueWeights.size();
    }
}
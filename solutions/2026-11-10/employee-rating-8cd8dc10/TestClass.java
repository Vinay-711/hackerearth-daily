import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        if (line1 == null) return;
        int N = Integer.parseInt(line1.trim());
        String line2 = br.readLine();
        if (line2 == null) return;
        String[] arr_workload = line2.trim().split("\\s+");
        int[] workload = new int[N];
        for (int i = 0; i < N; i++) {
            workload[i] = Integer.parseInt(arr_workload[i]);
        }

        int out_ = solve(N, workload);
        System.out.println(out_);

        br.close();
    }

    static int solve(int N, int[] workload) {
        int maxConsecutive = 0;
        int currentConsecutive = 0;
        for (int i = 0; i < N; i++) {
            if (workload[i] > 6) {
                currentConsecutive++;
                if (currentConsecutive > maxConsecutive) {
                    maxConsecutive = currentConsecutive;
                }
            } else {
                currentConsecutive = 0;
            }
        }
        return maxConsecutive;
    }
}
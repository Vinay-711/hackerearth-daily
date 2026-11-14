import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        if (line1 == null) return;
        int N = Integer.parseInt(line1.trim());
        String[] arr_a = br.readLine().split("\\s+");
        int[] a = new int[N];
        int maxA = 0;
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(arr_a[i]);
            if (a[i] > maxA) {
                maxA = a[i];
            }
        }

        boolean out_ = SafeProgramming(N, a, maxA);
        System.out.println(out_ ? "1" : "0");

        br.close();
    }

    static boolean SafeProgramming(int N, int[] a, int maxA) {
        for (int i = 0; i < N; i++) {
            if (a[i] < maxA) {
                double n = Math.pow(2, a[i]) - 1;
                double n3 = n * n * n;
                double maxVal = Math.pow(2, maxA) - 1;
                if (n3 > maxVal) {
                    return false;
                }
            }
        }
        return true;
    }
}
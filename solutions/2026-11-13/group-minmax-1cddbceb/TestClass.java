import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();
        if (line1 == null || line2 == null) return;
        int A = Integer.parseInt(line1.trim());
        int B = Integer.parseInt(line2.trim());

        long[] out_ = MinMax(A, B);
        System.out.println(out_[0] + " " + out_[1]);
        br.close();
    }

    static long[] MinMax(int A, int B) {
        long n = (long) A;
        long b = (long) B;

        long q = n / b;
        long r = n % b;

        long minConnections = r * (q + 1) * q / 2 + (b - r) * q * (q - 1) / 2;

        long maxGroupSize = n - (b - 1);
        long maxConnections = maxGroupSize * (maxGroupSize - 1) / 2;

        return new long[]{minConnections, maxConnections};
    }
}
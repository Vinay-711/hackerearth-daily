import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().trim().split("\\s+");
        int N = Integer.parseInt(line1[0]);
        int Q = Integer.parseInt(line1[1]);
        String[] line2 = br.readLine().trim().split("\\s+");
        Map<Integer, Integer> primeCounts = new HashMap<Integer, Integer>();
        int maxVal = 100000;
        int[] minPrime = new int[maxVal + 1];
        for (int i = 2; i <= maxVal; i++) {
            if (minPrime[i] == 0) {
                for (int j = i; j <= maxVal; j += i) {
                    if (minPrime[j] == 0) minPrime[j] = i;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(line2[i]);
            while (val > 1) {
                int p = minPrime[val];
                primeCounts.put(p, primeCounts.containsKey(p) ? primeCounts.get(p) + 1 : 1);
                val /= p;
            }
        }
        long MOD = 1000000007L;
        List<Integer> primes = new ArrayList<Integer>(primeCounts.keySet());
        int totalMaxY = 0;
        for (int count : primeCounts.values()) totalMaxY += count;
        long[] dp = new long[totalMaxY + 1];
        dp[0] = 1;
        for (int p : primes) {
            int count = primeCounts.get(p);
            long[] nextDp = new long[totalMaxY + 1];
            long[] pPowers = new long[count + 1];
            pPowers[0] = 1;
            for (int k = 1; k <= count; k++) pPowers[k] = (pPowers[k - 1] * p) % MOD;
            for (int j = 0; j <= totalMaxY; j++) {
                if (dp[j] == 0) continue;
                for (int k = 0; k <= count && j + k <= totalMaxY; k++) {
                    nextDp[j + k] = (nextDp[j + k] + dp[j] * pPowers[k]) % MOD;
                }
            }
            dp = nextDp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int Y = Integer.parseInt(br.readLine().trim());
            if (Y > totalMaxY) sb.append("0\n");
            else sb.append(dp[Y]).append("\n");
        }
        System.out.print(sb.toString());
    }
}
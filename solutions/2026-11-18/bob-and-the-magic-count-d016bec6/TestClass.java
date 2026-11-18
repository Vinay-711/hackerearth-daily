import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestClass {
    private static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String nStr = br.readLine();
            while (nStr != null && nStr.trim().isEmpty()) {
                nStr = br.readLine();
            }
            if (nStr == null) break;
            int n = Integer.parseInt(nStr.trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long overallGcd = 0;
            for (int i = 1; i <= n; i++) {
                long val = Long.parseLong(st.nextToken());
                if (i == 1) overallGcd = val;
                else overallGcd = gcd(overallGcd, val);
            }
            if (overallGcd == 1) {
                sb.append(0).append('\n');
                continue;
            }
            long cur = overallGcd;
            long cost = 0;
            for (int i = n; i >= 1 && cur != 1; i--) {
                long newCur = gcd(cur, i);
                if (newCur < cur) {
                    cost += (long) (n - i + 1);
                    cur = newCur;
                }
            }
            sb.append(cost).append('\n');
        }
        System.out.print(sb.toString());
    }
}
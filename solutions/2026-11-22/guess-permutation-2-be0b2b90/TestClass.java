import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] arr = new long[N];
            long total = 0L;
            for (int i = 0; i < N; i++) {
                long val = Long.parseLong(st.nextToken());
                arr[i] = val;
                total += val;
            }
            long target = (long) N * (N + 1) / 2;
            if (total != target) {
                sb.append("NO\n");
                continue;
            }
            long prefix = 0L;
            boolean ok = true;
            for (int i = 0; i < N; i++) {
                prefix += arr[i];
                long need = (long) (i + 1) * (i + 2) / 2; // sum 1..(i+1)
                if (prefix < need) {
                    ok = false;
                    break;
                }
            }
            sb.append(ok ? "YES\n" : "NO\n");
        }
        System.out.print(sb.toString());
    }
}
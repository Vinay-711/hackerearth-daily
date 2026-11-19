import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            long K = Long.parseLong(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long sum = 0L;
            for (int i = 0; i < N; i++) {
                sum += Long.parseLong(st.nextToken());
            }

            long currentDenominator = (long)N;
            long additionsNeeded;

            // Check if the current average already satisfies the condition
            // floor(sum / N) <= K
            if (sum / currentDenominator <= K) {
                additionsNeeded = 0;
            } else {
                // We need to find the minimum x such that floor(sum / (N + x)) <= K
                // This is equivalent to sum / (N + x) < K + 1
                // Rearranging, we get (N + x) > sum / (K + 1)
                // The smallest integer value for (N + x) satisfying this is floor(sum / (K + 1)) + 1
                long targetTotalElements = (sum / (K + 1)) + 1;
                additionsNeeded = targetTotalElements - N;
            }
            
            sb.append(additionsNeeded).append('\n');
        }
        System.out.print(sb.toString());
    }
}
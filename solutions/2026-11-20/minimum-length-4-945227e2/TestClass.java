import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] A = new int[N];
            int[] B = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }
            int first = -1;
            int last = -1;
            for (int i = 0; i < N; i++) {
                if (A[i] != B[i]) {
                    if (first == -1) first = i;
                    last = i;
                }
            }
            int ans = (first == -1) ? 0 : (last - first + 1);
            out.append(ans).append('\n');
        }
        System.out.print(out.toString());
    }
}
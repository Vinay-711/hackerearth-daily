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
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                int val = Integer.parseInt(st.nextToken());
                if (val < min) min = val;
            }
            out.append(min).append('\n');
        }
        System.out.print(out.toString());
    }
}
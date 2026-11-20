import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long runs = 0;
        int prev = -1; // sentinel, values are >=1
        for (int i = 0; i < n; i++) {
            int cur = Integer.parseInt(st.nextToken());
            if (i == 0 || cur != prev) {
                runs++;
            }
            prev = cur;
        }
        System.out.println(runs);
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            HashMap<Integer, Long> map = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int val = Integer.parseInt(st.nextToken());
                if (val > 0) {
                    map.put(val, map.getOrDefault(val, 0L) + val);
                }
            }
            if (map.isEmpty()) {
                out.append(0).append('\n');
                continue;
            }
            ArrayList<Long> sums = new ArrayList<>(map.values());
            Collections.sort(sums, Collections.reverseOrder());
            long ans = 0L;
            int limit = Math.min(K, sums.size());
            for (int i = 0; i < limit; i++) {
                ans += sums.get(i);
            }
            out.append(ans).append('\n');
        }
        System.out.print(out.toString());
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        StringTokenizer st = new StringTokenizer(line);
        if (!st.hasMoreTokens()) return;
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            if (line == null) break;
            st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            String s = br.readLine();
            while (s != null && s.trim().isEmpty()) {
                s = br.readLine();
            }
            if (s == null) break;
            s = s.trim();
            
            int[] freq = new int[26];
            int distinctCount = 0;
            int maxFreq = 0;
            
            for (int j = 0; j < s.length(); j++) {
                int idx = s.charAt(j) - 'a';
                if (freq[idx] == 0) {
                    distinctCount++;
                }
                freq[idx]++;
                if (freq[idx] > maxFreq) {
                    maxFreq = freq[idx];
                }
            }
            
            if (k <= distinctCount && k <= maxFreq && k <= n) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb.toString());
    }
}
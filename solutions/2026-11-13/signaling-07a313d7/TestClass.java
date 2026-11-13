import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String line = br.readLine();
        if (line != null) {
            int T = Integer.parseInt(line.trim());
            for (int t_i = 0; t_i < T; t_i++) {
                String nLine = br.readLine();
                if (nLine == null) break;
                int N = Integer.parseInt(nLine.trim());
                String S = br.readLine();
                int out_ = solution(N, S);
                wr.println(out_);
            }
        }
        wr.flush();
        wr.close();
        br.close();
    }

    static int solution(int N, String S) {
        int maxConsecutive = 0;
        int currentConsecutive = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                currentConsecutive++;
                if (currentConsecutive > maxConsecutive) {
                    maxConsecutive = currentConsecutive;
                }
            } else {
                currentConsecutive = 0;
            }
        }
        return maxConsecutive;
    }
}
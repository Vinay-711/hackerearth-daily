import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        
        String line1 = br.readLine();
        if (line1 == null) return;
        int N = Integer.parseInt(line1.trim());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] received = new boolean[N + 1];
        int next = N;
        
        for (int i = 0; i < N; i++) {
            int disk = Integer.parseInt(st.nextToken());
            received[disk] = true;
            
            StringBuilder sb = new StringBuilder();
            while (next > 0 && received[next]) {
                sb.append(next).append(" ");
                next--;
            }
            wr.println(sb.toString().trim());
        }
        
        wr.flush();
        wr.close();
        br.close();
    }
}
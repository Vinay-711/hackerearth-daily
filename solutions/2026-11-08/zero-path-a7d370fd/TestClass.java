import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int T = Integer.parseInt(line.trim());
        while (T-- > 0) {
            String nLine = br.readLine();
            if (nLine == null) break;
            int N = Integer.parseInt(nLine.trim());
            int[] degree = new int[N + 1];
            for (int i = 0; i < N - 1; i++) {
                String[] edge = br.readLine().split("\\s+");
                int u = Integer.parseInt(edge[0]);
                int v = Integer.parseInt(edge[1]);
                degree[u]++;
                degree[v]++;
            }
            String[] weights = br.readLine().split("\\s+");
            if (N <= 2) {
                System.out.println(0);
            } else {
                int count = 0;
                for (int i = 0; i < N; i++) {
                    long w = Long.parseLong(weights[i]);
                    if (degree[i + 1] > 1 && w > 0) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
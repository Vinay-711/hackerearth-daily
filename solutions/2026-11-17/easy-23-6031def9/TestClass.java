import java.io.*;
import java.util.*;

public class TestClass {
    private static boolean[] rows;
    private static boolean[] cols;
    private static int rowsFilled = 0;
    private static int colsFilled = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        String[] strs = line.trim().split("\\s+");

        int N = Integer.parseInt(strs[0]);
        int K = Integer.parseInt(strs[1]);

        rows = new boolean[N + 1];
        cols = new boolean[N + 1];

        StringBuilder sb = new StringBuilder();
        while (K-- > 0) {
            String taskLine = br.readLine();
            if (taskLine == null) break;
            String[] task = taskLine.trim().split("\\s+");
            int i = Integer.parseInt(task[0]);
            int j = Integer.parseInt(task[1]);

            if (!rows[i]) {
                rows[i] = true;
                rowsFilled++;
            }
            if (!cols[j]) {
                cols[j] = true;
                colsFilled++;
            }

            long emptyCells = (long) (N - rowsFilled) * (N - colsFilled);
            sb.append(emptyCells).append(" ");
        }
        System.out.println(sb.toString().trim());
        br.close();
    }
}
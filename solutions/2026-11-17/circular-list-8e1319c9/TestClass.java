import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        if (line1 == null) return;
        int n = Integer.parseInt(line1.trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[][] out_ = queue_and_stack(A);
        PrintWriter wr = new PrintWriter(System.out);
        for (int i = 0; i < out_.length; i++) {
            for (int j = 0; j < out_[i].length; j++) {
                wr.print(out_[i][j] + (j == out_[i].length - 1 ? "" : " "));
            }
            wr.println();
        }
        wr.flush();
        wr.close();
        br.close();
    }

    static int[][] queue_and_stack(int[] A) {
        int maxVal = 1000000;
        boolean[] isNotPrime = new boolean[maxVal + 1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int p = 2; p * p <= maxVal; p++) {
            if (!isNotPrime[p]) {
                for (int i = p * p; i <= maxVal; i += p)
                    isNotPrime[i] = true;
            }
        }

        List<Integer> queue = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();

        for (int num : A) {
            if (!isNotPrime[num]) {
                queue.add(num);
            } else {
                stack.add(num);
            }
        }

        int[][] result = new int[2][];
        result[0] = new int[queue.size()];
        for (int i = 0; i < queue.size(); i++) {
            result[0][i] = queue.get(i);
        }
        
        result[1] = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[1][i] = stack.get(stack.size() - 1 - i);
        }

        return result;
    }
}
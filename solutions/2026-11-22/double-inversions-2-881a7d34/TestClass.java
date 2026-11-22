import java.io.*;
import java.util.*;

class TestClass {
    static class FenwickTree {
        int n;
        int[] tree;

        public FenwickTree(int n) {
            this.n = n;
            tree = new int[n + 1];
        }

        public void update(int index, int delta) {
            while (index <= n) {
                tree[index] += delta;
                index += index & (-index);
            }
        }

        public int query(int index) {
            int sum = 0;
            while (index > 0) {
                sum += tree[index];
                index -= index & (-index);
            }
            return sum;
        }

        public int findKthSmallest(int k) {
            int pos = 0;
            int logN = 32 - Integer.numberOfLeadingZeros(n);
            for (int i = logN; i >= 0; i--) {
                int nextPos = pos + (1 << i);
                if (nextPos <= n && tree[nextPos] < k) {
                    pos = nextPos;
                    k -= tree[nextPos];
                }
            }
            return pos + 1;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] IA = new int[n];
            int[] IR = new int[n];

            String[] iaStr = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                IA[i] = Integer.parseInt(iaStr[i]);
            }

            String[] irStr = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                IR[i] = Integer.parseInt(irStr[i]);
            }

            // Check validity of IA
            boolean valid = true;
            for (int i = 0; i < n; i++) {
                if (IA[i] < 0 || IA[i] > i) {
                    valid = false;
                    break;
                }
            }

            if (!valid) {
                sb.append("-1\n");
                continue;
            }

            // Reconstruct A from IA
            FenwickTree ft = new FenwickTree(n);
            for (int i = 1; i <= n; i++) {
                ft.update(i, 1);
            }

            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                // IA[i] is the number of elements greater than A[i] before it.
                // This means A[i] is the (IA[i] + 1)-th largest among the remaining elements.
                // The number of remaining elements is n - i.
                // The rank from the smallest is (n - i) - IA[i].
                int rankFromSmallest = (n - i) - IA[i];
                int val = ft.findKthSmallest(rankFromSmallest);
                A[i] = val;
                ft.update(val, -1);
            }

            // Compute R (reverse of A)
            int[] R = new int[n];
            for (int i = 0; i < n; i++) {
                R[i] = A[n - 1 - i];
            }

            // Compute inversion counts for R
            int[] IR_computed = new int[n];
            FenwickTree ft2 = new FenwickTree(n);
            for (int i = 0; i < n; i++) {
                // IR_computed[i] is the number of elements greater than R[i] before it.
                // Total elements before i is i.
                // Number of elements smaller or equal to R[i] before it is query(R[i]).
                // So, number of elements greater than R[i] before it is i - query(R[i]).
                int smallerOrEqual = ft2.query(R[i]);
                IR_computed[i] = i - smallerOrEqual;
                ft2.update(R[i], 1);
            }

            // Compare IR_computed with IR
            for (int i = 0; i < n; i++) {
                if (IR_computed[i] != IR[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                for (int i = 0; i < n; i++) {
                    if (i > 0) sb.append(" ");
                    sb.append(A[i]);
                }
                sb.append("\n");
            } else {
                sb.append("-1\n");
            }
        }

        System.out.print(sb.toString());
    }
}
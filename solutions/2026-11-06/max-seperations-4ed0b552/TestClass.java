import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(N, K, arr));
    }

    public static int solve(int N, int K, int[] arr) {
        List<Integer> costs = new ArrayList<>();
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < N - 1; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }

            if (oddCount == evenCount) {
                int cost = Math.abs(arr[i] - arr[i + 1]);
                costs.add(cost);
            }
        }

        Collections.sort(costs);

        int count = 0;
        int currentCost = 0;
        for (int cost : costs) {
            if (currentCost + cost <= K) {
                currentCost += cost;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];
        String[] parts = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        
        Arrays.sort(arr);
        
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        
        long[] suffix = new long[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            // Skip duplicates
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            
            // Find the first index where arr[j] >= x
            int left = Arrays.binarySearch(arr, x);
            if (left < 0) {
                left = -left - 1;
            }
            
            // Find the last index where arr[j] <= x
            int right = Arrays.binarySearch(arr, x);
            if (right < 0) {
                right = -right - 1;
            } else {
                while (right + 1 < n && arr[right + 1] == x) {
                    right++;
                }
            }
            
            // Sum of elements less than x
            long sumLess = prefix[left];
            // Sum of elements greater than x
            long sumGreater = suffix[right + 1];
            
            // Check if both groups are non-empty and sums are equal
            if (left > 0 && right + 1 < n && sumLess == sumGreater) {
                found = true;
                break;
            }
        }
        
        System.out.println(found ? "YES" : "NO");
    }
}
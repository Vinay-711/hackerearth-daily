import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            String[] nq = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nq[0]);
            int q = Integer.parseInt(nq[1]);
            
            long[] arr = new long[n];
            String[] arrStr = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(arrStr[i]);
            }
            
            Arrays.sort(arr);
            
            long[] prefix = new long[n + 1];
            prefix[0] = 0;
            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1] + arr[i - 1];
            }
            
            for (int i = 0; i < q; i++) {
                long k = Long.parseLong(br.readLine().trim());
                
                // Find the largest index idx such that prefix[idx] < k
                // prefix is 0-indexed from 0 to n
                int low = 0;
                int high = n;
                int ans = 0;
                
                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (prefix[mid] < k) {
                        ans = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                
                sb.append(ans).append("\n");
            }
        }
        
        System.out.print(sb.toString());
    }
}
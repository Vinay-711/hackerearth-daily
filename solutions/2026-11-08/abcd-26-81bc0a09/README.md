# abcd-26-81bc0a09

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/abcd-26-81bc0a09/)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the sum of the smallest missing natural number (MEX) for every possible subarray. Since N is up to 5000, an O(N^2) approach is efficient enough. For each starting index i, we iterate through all ending indices j, maintaining a boolean array or a set to track numbers present in the current subarray [i, j]. Since we only care about the smallest missing natural number, we can use a boolean array of size N+2 to track presence. The time complexity is O(N^2) and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

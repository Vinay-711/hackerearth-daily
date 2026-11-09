# make-an-array-85abd7ad

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/make-an-array-85abd7ad/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

Let x_i be the number of times we choose to exclude index i from the operation. The total number of operations is S = sum(x_i). In each operation, we add 1 to all indices except one. Thus, the value at index i after all operations is S - x_i = A[i]. Summing this over all i gives sum(A[i]) = N*S - sum(x_i) = N*S - S = S*(N-1). Therefore, S = sum(A[i]) / (N-1). If sum(A[i]) is not divisible by (N-1), it is impossible. Also, for each i, x_i = S - A[i] must be non-negative. If any x_i < 0, it is impossible. Time complexity is O(N) per test case, space complexity is O(1) beyond input storage.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

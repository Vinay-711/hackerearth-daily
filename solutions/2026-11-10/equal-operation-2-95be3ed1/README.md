# equal-operation-2-95be3ed1

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/equal-operation-2-95be3ed1/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To make all elements equal to some value 'k', each original element A[i] must be split into A[i]/k pieces (if A[i] is divisible by k). The number of operations to split A[i] into A[i]/k pieces is (A[i]/k) - 1. The total operations for a target value k is sum((A[i]/k) - 1) = (sum(A[i])/k) - N. To minimize this, we need to maximize k such that every A[i] is divisible by k. Thus, k must be a common divisor of all A[i]. The largest such k is the Greatest Common Divisor (GCD) of all elements in the array. Time complexity is O(N log(min(A))) per test case, space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# good-indices-c7058c9b

[Original practice problem](https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/good-indices-c7058c9b/)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

For each index i, we need to find the nearest element to the left (L) such that A[L] < A[i] and the nearest element to the right (R) such that A[R] < A[i]. The number of operations required is the count of elements between L and i, plus the count of elements between i and R. If no such L or R exists (i.e., i is at the boundary or no smaller element exists), the answer is -1. We use a monotonic stack to find the nearest smaller element to the left and right in O(N) time. The total time complexity is O(N) per test case, and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# longest-subsequence-queries-9c45a765

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/longest-subsequence-queries-9c45a765/)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**. Language: **Java**.

## Approach

The solution sorts the array and computes prefix sums. For each query, it uses binary search to find the largest number of smallest elements whose sum is strictly less than K. Time complexity is O(n log n + q log n) per test case, and space complexity is O(n) for storing the array and prefix sums.

## Verification

Solution generated in Java and verified Accepted on HackerEarth by autonomous AI bot.

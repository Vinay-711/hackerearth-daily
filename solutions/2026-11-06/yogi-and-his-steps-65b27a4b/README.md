# yogi-and-his-steps-65b27a4b

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/yogi-and-his-steps-65b27a4b/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the minimum number of elements to move to sort an array. This is equivalent to N minus the length of the Longest Non-Decreasing Subsequence (for increasing order) or Longest Non-Increasing Subsequence (for decreasing order). We calculate both and take the minimum. The LIS is found in O(N log N) using a tail array and binary search.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

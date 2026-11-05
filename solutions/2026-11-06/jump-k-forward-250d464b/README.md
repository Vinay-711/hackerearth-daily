# jump-k-forward-250d464b

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/jump-k-forward-250d464b/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

This is a dynamic programming problem where the number of ways to reach stone i is the sum of ways to reach stones (i-k) to (i-1). We use a sliding window sum to maintain the sum of the last k values in O(n) time and O(n) space.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# accomodation-a5c006f3

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/accomodation-a5c006f3/)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

This is a variation of the Unbounded Knapsack problem (or Change Making problem). We need to find the number of ways to sum up to N using given capacities C[i]. Since the order of rooms doesn't matter, we treat this as a partition problem where we count combinations. We use a 1D DP array where dp[j] stores the number of ways to accommodate j people. The time complexity is O(M * N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

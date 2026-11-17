# pair-sums

[Original practice problem](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/pair-sums/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To solve this problem efficiently, we use a boolean array as a hash set to track the numbers encountered so far. Since the constraints on A[i] are up to 10^6, a boolean array of size 1,000,001 is sufficient. For each number x in the input, we check if (K - x) has already been seen. If it has, we found a pair. This approach provides O(N) time complexity and O(max(A[i])) space complexity, which is optimal for the given constraints.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

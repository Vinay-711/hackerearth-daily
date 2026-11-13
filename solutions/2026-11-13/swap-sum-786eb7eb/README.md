# swap-sum-786eb7eb

[Original practice problem](https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/swap-sum-786eb7eb/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

For each index i, we calculate the potential gain of swapping A[i] and B[i], which is (B[i] - A[i]). We only perform the swap if B[i] > A[i]. We collect all positive gains, sort them in descending order, and pick the top K gains to maximize the sum. Time complexity is O(N log N) due to sorting, and space complexity is O(N) to store the gains.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

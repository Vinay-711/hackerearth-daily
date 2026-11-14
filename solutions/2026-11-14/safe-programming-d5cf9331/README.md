# safe-programming-d5cf9331

[Original practice problem](https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/safe-programming-d5cf9331/)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to verify if for every bit size a_i, if there exists any a_j > a_i, then n^3 must be representable by some bit size in the array, where n = 2^{a_i} - 1. The condition n^3 <= 2^{a_max} - 1 simplifies to (2^{a_i} - 1)^3 <= 2^{a_max} - 1. Since 2^{a_i} - 1 is approximately 2^{a_i}, the condition is roughly 2^{3 * a_i} <= 2^{a_max}, or 3 * a_i <= a_max. We find the maximum bit size in the array and check if for all a_i that are not the maximum, 3 * a_i <= a_max. Time complexity is O(N) to find the maximum and verify the condition.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

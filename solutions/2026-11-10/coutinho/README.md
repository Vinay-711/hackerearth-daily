# coutinho

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/state-space-reduction/practice-problems/algorithm/coutinho/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The function F(X) counts the total number of prime factors of X (with multiplicity). If X = p1^a1 * p2^a2 * ..., then F(X) = a1 + a2 + ... + an. We need to find the sum of all divisors X of K such that F(X) = Y. Let K = product of A[i]. We can find the prime factorization of K by summing the prime factor counts of each A[i]. Let the prime factorization of K be p1^e1 * p2^e2 * ... * pm^em. A divisor X = p1^x1 * p2^x2 * ... * pm^xm where 0 <= xi <= ei. The condition F(X) = Y becomes sum(xi) = Y. This is a classic dynamic programming problem: given counts of available prime factors, find the sum of all products p1^x1 * ... * pm^xm such that sum(xi) = Y. We use DP where dp[i][j] is the sum of products using first i primes with total exponent sum j. The transition is dp[i][j] = sum_{k=0 to min(j, ei)} (dp[i-1][j-k] * pi^k). Time complexity: O(N * max(A) + M * Y^2) where M is number of distinct prime factors.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# Divisordilemma

Problem: [divisordilemma](https://www.hackerearth.com/community/problem/algorithm/divisordilemma-b2434e95/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerearth.com/submission/132641116/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Sieve the sum of divisors for each integer up to the largest requested N. Sort queries by N and insert successive divisor sums into Fenwick trees storing occurrence counts and sum totals. The optimal choice consists of the M largest divisor sums. Fenwick binary lifting computes the sum of the N-M smallest values, including partial multiplicity at the cutoff; subtract this from the running total. Restore answers to original query order, using long sums.

Complexity: O(V log V + T log T + (V+T) log S) time; O(V+T+S) space, V=max N and S=max divisor sum.

## Verification

Run `python3 solutions/2026-11-03/divisordilemma/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.

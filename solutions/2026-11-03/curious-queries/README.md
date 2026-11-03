# Curious Queries

Problem: [curious-queries](https://www.hackerearth.com/community/problem/algorithm/curious-queries-112c4758/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerearth.com/submission/132638648/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Process queries offline in ascending left endpoint L. Insert the newly included prefix values into a Fenwick tree indexed by value, storing their sums. The answer is the total prefix sum minus the sum of values less than or equal to A[R], so equality is correctly excluded. Restore answers to original query order and use long for weighted sums.

Complexity: O(Q log Q + (N+Q) log V) time and O(N+Q+V) space for V=100000.

## Verification

Run `python3 solutions/2026-11-03/curious-queries/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.

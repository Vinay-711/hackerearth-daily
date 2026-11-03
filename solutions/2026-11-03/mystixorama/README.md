# Mystixorama

Problem: [mystixorama](https://www.hackerearth.com/community/problem/algorithm/mystixorama-26468c50/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerearth.com/submission/132641059/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Order range queries with Mo’s algorithm. Maintain the frequency of every compressed value and XOR of distinct values in each positive-frequency bucket. Moving an endpoint removes the value from its old bucket and inserts it in its new bucket. Square-root blocks maintain sums of bucket XORs, so each frequency-interval answer combines two partial blocks and complete block sums. Zero frequency is excluded. Use long arithmetic for the sum, while retaining int XORs.

Complexity: O(N log N + Q log Q + (N+Q) sqrt(N) + Q sqrt(N)) time and O(N+Q) space.

## Verification

Run `python3 solutions/2026-11-03/mystixorama/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.

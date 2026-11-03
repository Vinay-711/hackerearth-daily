# Tree Subtree Divisibility

Problem: [tree-subtree-divisibility](https://www.hackerearth.com/community/problem/algorithm/tree-subtree-divisibility-db02e0dc/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerearth.com/submission/132641083/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Root the tree and accumulate subtree sums modulo X using an iterative traversal. If the total is nonzero, every answer is zero. Otherwise, an edge may be cut exactly when its child subtree sum is zero modulo X. Any subset of these eligible edges works, including nested cuts, since subtracting zero-residue subtrees preserves divisibility. If m edges are eligible, the count for k components is C(m,k-1). Precompute factorials and inverse factorials modulo the prime.

Complexity: O(N) time per tree plus O(M) shared factorial preprocessing; O(N+M) space, M=200000.

## Verification

Run `python3 solutions/2026-11-03/tree-subtree-divisibility/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.

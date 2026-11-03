# Rebelreach

Problem: [rebelreach](https://www.hackerearth.com/community/problem/algorithm/rebelreach-e1a2d3d1/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerearth.com/submission/132637460/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Root the tree iteratively and store cumulative guard counts. Rebels can reach ancestor v exactly when guards strictly below v consume fewer than X rebels; equality means nobody reaches v. Binary lifting tests this monotone condition from the largest jump downward. The arrival city itself remains the answer even if its guards stop everyone. Iterative traversal avoids stack overflow on a million-node chain.

Complexity: O((N+Q) log N) time and O(N log N) space.

## Verification

Run `python3 solutions/2026-11-03/rebelreach/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.

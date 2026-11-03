# Tree Inversions

Problem: [tree-inversions](https://www.hackerearth.com/community/problem/algorithm/tree-inversions-6e63ac4a/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerearth.com/submission/132641109/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Reversing a path makes each unequal-colored pair an inversion in exactly one direction; equal-colored pairs contribute zero. Thus answer equals the number of unordered unequal-color pairs on the path. Use a twice-occurring Euler tour, binary-lifting LCA and Mo’s algorithm on tree paths. Toggle nodes as interval endpoints move. Adding color c creates total-frequency[c] unequal pairs; removal reverses this. Non-ancestor queries temporarily toggle their LCA. Iterative DFS avoids stack overflow on chains.

Complexity: O(N log N + Q log Q + (N+Q) sqrt(N)) time; O(N log N + Q) space.

## Verification

Run `python3 solutions/2026-11-03/tree-inversions/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.

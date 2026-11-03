# Power Game

Problem: [power-game](https://www.hackerearth.com/community/problem/algorithm/power-game-3-5327c490/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerearth.com/submission/132639491/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Only bridges are legal moves. Removing a bridge cannot destroy a cycle elsewhere, so the initial bridges remain the entire independent pool of legal edges. With positive weights, optimal play takes the greatest remaining bridge each turn. Compute bridges with an iterative low-link DFS, preserving edge IDs for parallel edges, sort their powers, and sum alternating positions for first and second player.

Complexity: O(N+M+K log K) time and O(N+M) space, where K is the number of bridges.

## Verification

Run `python3 solutions/2026-11-03/power-game/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.

# flip-grid-c6f88af8

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/flip-grid-c6f88af8/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_flip-grid-c6f88af8_1794511657`

## Approach

We can represent the 4x4 binary grid as a 16-bit integer (bitmask). Breadth-First Search (BFS) is used to find the minimum number of operations. We first insert all 4 possible rotations of the start grid with their rotation counts as the initial distances. Then we explore transitions by flipping any row or column. If we reach the target grid, we print the distance. If the queue becomes empty without reaching the target, we output -1. The state space size is at most 2^16 = 65536, making BFS extremely efficient.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

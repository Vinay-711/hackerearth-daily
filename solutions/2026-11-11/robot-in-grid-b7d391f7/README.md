# robot-in-grid-b7d391f7

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/shortest-path-algorithms/practice-problems/algorithm/robot-in-grid-b7d391f7/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem requires finding the shortest path in an unweighted grid, which is solved using Breadth-First Search (BFS). Since the source is fixed and there are multiple queries, we perform a single BFS starting from (Si, Sj) to precompute the shortest distance to all reachable cells in the grid. The time complexity is O(N*M) for the BFS and O(1) per query, resulting in O(N*M + Q) total time. Space complexity is O(N*M) to store the grid and the distance matrix.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

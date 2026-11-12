# areas-0475fb6e

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/areas-0475fb6e/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_areas-0475fb6e_1794511884`

## Approach

The problem is solved using Depth First Search (DFS) to identify connected components of '.' characters in a 2D grid. For each unvisited '.' cell, we trigger a DFS that marks all reachable '.' cells as '#' (visited) and counts the size of the component. The time complexity is O(R * C) where R is the number of rows and C is the number of columns, as each cell is visited once. The space complexity is O(R * C) in the worst case due to the recursion stack.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

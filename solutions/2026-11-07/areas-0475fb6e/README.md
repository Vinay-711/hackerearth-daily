# areas-0475fb6e

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/areas-0475fb6e/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to find the sizes of connected components of '.' characters in a 2D grid. I use a Depth First Search (DFS) approach to traverse each unvisited '.' cell. For each component found, I count the number of cells visited and store these sizes in a list. The time complexity is O(R * C) where R is rows and C is columns, as each cell is visited once. Space complexity is O(R * C) for the grid and the recursion stack.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

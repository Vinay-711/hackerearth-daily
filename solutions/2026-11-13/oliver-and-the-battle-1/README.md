# oliver-and-the-battle-1

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/oliver-and-the-battle-1/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_oliver-and-the-battle-1_1794509074`

## Approach

The problem is solved using Depth First Search (DFS) to identify connected components (troops) in an N x M grid. Each cell with a '1' is treated as a node, and adjacent cells (including diagonals) are connected. We iterate through the grid, and whenever an unvisited '1' is found, we increment the troop count and perform a DFS to count all connected '1's, marking them as visited by setting them to '0'. The time complexity is O(N*M) as each cell is visited a constant number of times, and space complexity is O(N*M) due to the recursion stack in the worst case.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

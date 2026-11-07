# oliver-and-the-battle-1

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/oliver-and-the-battle-1/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to find the number of connected components (troops) and the size of the largest component in a grid where connectivity is defined by 8-way adjacency. I used a Depth First Search (DFS) approach to traverse the grid. For each unvisited cell containing a '1', I initiate a DFS to count all connected '1's, marking them as visited by setting them to '0'. The time complexity is O(N*M) as each cell is visited a constant number of times, and space complexity is O(N*M) for the recursion stack in the worst case.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

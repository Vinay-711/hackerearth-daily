# traffic-light-2-ee27ba45

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/traffic-light-2-ee27ba45/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the shortest path in an unweighted graph where edge weights are effectively uniform (C minutes), but waiting times depend on the current time modulo T. Since all edges have the same cost C, a Breadth-First Search (BFS) is sufficient to find the shortest path. To ensure the lexicographically smallest path, we sort the adjacency lists for each node. We track the current time at each node to calculate waiting times: if (currentTime / T) is odd, the airport is in 'Loading' state, requiring a wait until the next multiple of T. Time complexity is O(N + M log N) due to sorting adjacency lists and BFS traversal, and space complexity is O(N + M).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

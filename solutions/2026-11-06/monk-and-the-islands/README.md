# monk-and-the-islands

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/monk-and-the-islands/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the minimum number of bridges to reach Island N from Island 1 in an unweighted, undirected graph. This can be modeled as finding the shortest path in an unweighted graph, which can be solved efficiently using Breadth-First Search (BFS).

Time Complexity: O(T * (N + M)) which takes around 10^6 operations total, well within the 3.0 second time limit.
Space Complexity: O(N + M) to store the adjacency list representation of the graph and the distance array.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

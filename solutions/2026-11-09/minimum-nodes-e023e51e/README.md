# minimum-nodes-e023e51e

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/minimum-nodes-e023e51e/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

Since Q is very small (up to 10), we can perform a Breadth-First Search (BFS) for each query starting from node X. BFS naturally explores nodes in increasing order of distance (number of nodes). The first time we encounter a path (sum of nodes from root to current node) that satisfies the condition sum >= K, the current depth is the minimum number of nodes. We use an adjacency list to represent the tree and a queue to manage the BFS state, storing the current node, parent node, current path sum, and current node count. Time complexity is O(Q * N), space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

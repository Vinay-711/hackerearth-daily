# water-flow-4-38cea6c6

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/water-flow-4-38cea6c6/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the maximum number of cities reachable from a single source city in a tree structure, where some cities are blocked. Since the graph is a tree, removing all blocked nodes splits the tree into several connected components. The answer is the size of the largest connected component. We can find these components using a Disjoint Set Union (DSU) or by traversing the graph. Given the constraints (N=2e5), a simple BFS or DFS on the unblocked nodes is efficient with O(N) time and space complexity.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

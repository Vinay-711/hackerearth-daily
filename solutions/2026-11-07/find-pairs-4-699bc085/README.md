# find-pairs-4-699bc085

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/find-pairs-4-699bc085/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The condition d(i, j) = d(i, 1) - d(j, 1) implies that j must be an ancestor of i (or i=j). In a rooted tree, d(i, 1) is the depth of node i. The distance between two nodes i and j is d(i, j) = depth(i) + depth(j) - 2 * depth(LCA(i, j)). Substituting this into the condition gives depth(i) + depth(j) - 2 * depth(LCA(i, j)) = depth(i) - depth(j), which simplifies to 2 * depth(j) = 2 * depth(LCA(i, j)), or depth(j) = depth(LCA(i, j)). This equality holds if and only if j is an ancestor of i. Thus, for every node i, the number of valid j's is equal to the number of ancestors of i (including itself), which is depth(i) + 1 (assuming root is at depth 0). The total count is the sum of (depth(i) + 1) for all nodes i. Time complexity is O(N) to traverse the tree, space complexity is O(N) for the adjacency list.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

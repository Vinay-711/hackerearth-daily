# find-pairs-4-699bc085

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/find-pairs-4-699bc085/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_find-pairs-4-699bc085_1794511846`

## Approach

The condition d(i, j) = d(i, 1) - d(j, 1) implies that j must be an ancestor of i (or i=j). In a rooted tree, for any node i, the number of nodes j that satisfy this condition is exactly the number of nodes on the path from the root to i, which is depth(i) + 1 (where root depth is 0). Thus, the total number of pairs is the sum of (depth(i) + 1) for all nodes i in the tree. This is calculated using a simple DFS or BFS traversal in O(N) time and O(N) space.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# minimize-the-magic-05a3986c

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/minimize-the-magic-05a3986c/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to minimize the total sum of node values after adding a new node with value X. The wave operation defines the value of each node as the sum of its subtree. If we attach the new node X as a child of node U, the new node X contributes to the subtree sum of all its ancestors. Specifically, if the new node is at depth D (root at depth 1), it will be included in the subtree sums of all its ancestors, which are D nodes. Thus, the total sum increases by X * D. To minimize the total sum, we must attach the new node to an existing node U that has fewer than 2 children, such that the depth of the new node (depth[U] + 1) is minimized. We perform a BFS to calculate depths and child counts, then iterate through all nodes to find the minimum depth among those with fewer than 2 children. Time complexity is O(N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

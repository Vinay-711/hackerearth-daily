# minimize-the-magic-05a3986c

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/minimize-the-magic-05a3986c/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_minimize-the-magic-05a3986c_1794511942`

## Approach

The problem asks to minimize the sum of all node values after adding a new node with value X. The wave operation defines the value of each node as the sum of its subtree. If we attach the new node X as a child of node u, the new node X contributes to the value of every ancestor of u (including u itself). Specifically, if the new node is at depth D (root at depth 1), it adds X to the value of all its ancestors. There are D ancestors. Thus, the total sum increases by X * D. To minimize the total sum, we must attach the new node to a valid parent (a node with fewer than 2 children) that has the minimum depth. We perform a BFS to calculate depths and child counts, then iterate through all nodes to find the minimum depth among those with < 2 children. The final answer is the original sum of all subtree sums plus (minDepth + 1) * X. Time complexity is O(N), space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

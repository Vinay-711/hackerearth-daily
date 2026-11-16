# holiday-decorations-b53daa12

[Original practice problem](https://www.hackerearth.com/practice/data-structures/queues/basics-of-queues/practice-problems/algorithm/holiday-decorations-b53daa12/)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to maintain the number of edges connecting two nodes of the same color in a tree structure under point updates. We represent the tree using an adjacency list. For each node, we track its color and the number of neighbors that share the same color. The total beauty is the sum of these counts divided by 2. When a node's color changes, we update the 'same-color neighbor count' for the node itself and all its neighbors. Time complexity is O(N + M * degree), which is efficient enough given the constraints.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

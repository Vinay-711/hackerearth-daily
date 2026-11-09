# cryptic-line-92a6bd09

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/cryptic-line-92a6bd09/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To determine if Person X is an ancestor of Person Y in a tree rooted at node 1, we can compute the entry time (tin) and exit time (tout) for each node using Depth First Search (DFS). Node X is an ancestor of Node Y if and only if tin[X] <= tin[Y] and tout[X] >= tout[Y]. To avoid StackOverflowError on deep trees (e.g., line graphs with N = 200,000), we implement an iterative DFS instead of recursion. Fast I/O is used to handle input and output efficiently within the 1-second limit. Time Complexity: O(N + Q), Space Complexity: O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

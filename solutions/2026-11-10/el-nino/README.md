# el-nino

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/el-nino/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the number of pairs (U, V) such that V is in the subtree of U and the distance between them is equal to some A[K]. Since the tree is rooted at 1, the distance between U and V is depth[V] - depth[U]. We need to count pairs (U, V) where depth[V] - depth[U] = A[K]. This is equivalent to depth[V] - A[K] = depth[U]. We can use DFS to traverse the tree, maintaining a frequency map of depths encountered so far in the current path. For each node V, we check how many ancestors U exist at depth[V] - A[K]. Since we need to sum this for all A[K], we can pre-calculate the total count by iterating over all nodes and checking the existence of required depths in the current path. Time complexity is O(N * M) in the worst case, but since we only care about depths present in A, we can optimize to O(N + M) using a frequency array.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

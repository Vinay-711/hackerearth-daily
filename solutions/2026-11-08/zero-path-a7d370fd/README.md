# zero-path-a7d370fd

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/zero-path-a7d370fd/)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The beauty of a path B(u, v) is the sum of weights of nodes on the path excluding endpoints. The condition sum_{u,v} B(u, v) = 0 implies that for every node i, its weight w_i must be 0 if it lies on any path between two other nodes. A node lies on a path between two other nodes if and only if it is not a leaf node. Thus, all non-leaf nodes must have a weight of 0. If a node has degree > 1, it is an internal node and must be 0. If a node has degree 1, it is a leaf and its weight does not contribute to any path sum (excluding endpoints). Therefore, the minimum operations required is the count of internal nodes (degree > 1) that currently have a non-zero weight. Time complexity is O(N) to calculate degrees and count non-zero internal nodes, space complexity is O(N) to store degrees.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

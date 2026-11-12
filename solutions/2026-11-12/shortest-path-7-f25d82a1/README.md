# shortest-path-7-f25d82a1

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/shortest-path-algorithms/practice-problems/algorithm/shortest-path-7-f25d82a1/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem is modeled as a shortest path problem on a graph where nodes are cities 1 to N. Since a train from Li to Ri allows travel between any u, v such that Li <= u < v <= Ri, we can simplify this by creating a segment tree over the range [1, N]. Each node in the segment tree represents a range of cities. We add edges from each city to its corresponding leaf in the segment tree, and edges from segment tree nodes to their children. A train from Li to Ri with cost Wi is then an edge from the range [Li, Ri] in the segment tree to the destination city Ri. Using Dijkstra's algorithm on this graph, we find the shortest path. The number of nodes is O(N) and edges O(M log N), leading to O(M log N log N) time complexity.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

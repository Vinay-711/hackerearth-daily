# cross-the-river-052be366

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/shortest-path-algorithms/practice-problems/algorithm/cross-the-river-052be366/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem is modeled as a shortest path problem on a graph where each rock is a node. Two rocks are connected if they overlap (distance between centers <= sum of radii). We add a source node representing the shore y=B and a target node representing the shore y=A. A rock connects to the source if its distance to y=B is <= its radius, and to the target if its distance to y=A is <= its radius. We use BFS to find the shortest path from source to target. Time complexity is O(N^2) due to graph construction, and space complexity is O(N^2) for the adjacency list.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

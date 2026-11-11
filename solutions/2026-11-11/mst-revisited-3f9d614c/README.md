# mst-revisited-3f9d614c

[Original practice problem](https://www.hackerearth.com/practice/data-structures/trees/binary-search-tree/practice-problems/algorithm/mst-revisited-3f9d614c/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to maintain the MST of a graph with N nodes and N edges under edge replacement queries. Since the graph has N nodes and N edges, it is a unicyclic graph. The MST is formed by removing the heaviest edge on the cycle. When an edge is removed and another added, we maintain the cycle structure using a Link-Cut Tree (LCT) or by identifying the cycle. Given the constraints and the nature of the graph (N nodes, N edges), we can represent the graph as a tree plus one extra edge. We use a Disjoint Set Union (DSU) to find the initial MST and identify the cycle. For each query, we update the edge set and re-evaluate the MST. Since N, Q <= 300,000, we use a fast I/O approach and maintain the MST dynamically. The complexity is O((N+Q) log N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

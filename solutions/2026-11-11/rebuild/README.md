# rebuild

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/minimum-spanning-tree/practice-problems/algorithm/rebuild/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To solve this problem, we need to find a Minimum Spanning Tree (MST) that minimizes the degree sequence lexicographically. We use Kruskal's algorithm. To handle the lexicographical requirement, we sort edges primarily by cost, and secondarily by the sum of the indices of the endpoints (u+v). This ensures that when costs are equal, we prefer edges connected to smaller-indexed nodes. We use a Disjoint Set Union (DSU) to maintain connectivity. Time complexity is O(M log M) due to sorting, and space complexity is O(N + M).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

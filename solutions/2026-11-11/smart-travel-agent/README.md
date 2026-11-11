# smart-travel-agent

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/shortest-path-algorithms/practice-problems/algorithm/smart-travel-agent/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem is a variation of the widest path problem. We want to maximize the bottleneck capacity along a path from source to destination. We use a modified Dijkstra's algorithm where we maintain the maximum possible capacity to reach each node. To handle the lexicographical requirement, we store the path and compare it when capacities are equal. Time complexity is O(R log N) or O(N^2) depending on implementation, space complexity is O(N^2).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

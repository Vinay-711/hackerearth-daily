# path-with-hyperloops-21352dd1

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/shortest-path-algorithms/practice-problems/algorithm/path-with-hyperloops-21352dd1/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem is a shortest path problem on a graph where edges have weights 1 (roads) and 2 (hyperloops). Since the weights are small integers, we can use Dijkstra's algorithm with a PriorityQueue. The time complexity is O((M+K) log N) and space complexity is O(N + M + K).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

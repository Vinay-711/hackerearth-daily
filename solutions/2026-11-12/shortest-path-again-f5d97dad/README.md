# shortest-path-again-f5d97dad

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/shortest-path-algorithms/practice-problems/algorithm/shortest-path-again-f5d97dad/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To solve this problem, we observe that edge weights are positive ($w_i \ge 1$). Adding a cycle to any path increases the step multipliers of subsequent edges and adds extra edge costs, so any optimal path must be a simple path without cycles. A simple path in a graph of $N$ cities contains at most $N - 1$ edges. Thus, we can compute the minimum cost using dynamic programming where $dp[L][u]$ represents the minimum cost to reach city $u$ using exactly $L$ edges ($1 \le L < N$). The recurrence relation is $dp[L][v] = \min_{(u,v) \in E} (dp[L-1][u] + L \cdot w(u,v))$. The overall minimum distance to city $i$ is $\min_{0 \le L < N} dp[L][i]$. The time complexity is $O(N \cdot M)$ and space complexity is $O(N + M)$, which easily runs within the 5.0s time limit.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

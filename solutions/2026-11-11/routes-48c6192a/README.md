# routes-48c6192a

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/shortest-path-algorithms/practice-problems/algorithm/routes-48c6192a/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem is solved using Dijkstra's algorithm. The total cost for a path is defined as the sum of flight costs plus the opportunity cost (K * total time). Since layover time is 1 hour between flights, the total time for a path with M flights is (sum of flight times) + (M - 1). The total cost is (sum of flight costs) + K * (sum of flight times + M - 1). We use a priority queue to store states (current city, current total time, current total cost, path list) and track the minimum cost to reach each city to prune the search. Time complexity is O(X log N) and space complexity is O(N + X).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

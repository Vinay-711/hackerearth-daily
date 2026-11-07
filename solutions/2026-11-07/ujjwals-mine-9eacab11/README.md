# ujjwals-mine-9eacab11

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/ujjwals-mine-9eacab11/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the minimum time to reach two gold mines using two players. Since players move simultaneously, the time taken is the maximum of the time taken by each player to reach their assigned mine. We use BFS to precompute the shortest distance from each player to each mine. There are two possible assignments: (P1->M1, P2->M2) or (P1->M2, P2->M1). We calculate the time for both scenarios and take the minimum. If a mine is unreachable, we output No. Time complexity is O(T * N^2) and space complexity is O(N^2).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

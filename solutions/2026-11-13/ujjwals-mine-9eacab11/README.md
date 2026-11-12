# ujjwals-mine-9eacab11

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/ujjwals-mine-9eacab11/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_ujjwals-mine-9eacab11_1794511694`

## Approach

The problem is solved by calculating the shortest path from each player to each gold mine using Breadth-First Search (BFS). Since there are 2 players and 2 gold mines, we compute a 2x2 distance matrix where dists[i][j] is the distance from player i to mine j. We then evaluate the two possible assignments: (Player 0 to Mine 0, Player 1 to Mine 1) or (Player 0 to Mine 1, Player 1 to Mine 0). The time complexity is O(T * N^2) as we perform BFS from each player, and space complexity is O(N^2) to store the grid and distance matrices.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

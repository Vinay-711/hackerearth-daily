# minimum-nodes-e023e51e

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/minimum-nodes-e023e51e/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_minimum-nodes-e023e51e_1794512162`

## Approach

The problem asks for the shortest path starting from node X such that the sum of node values is at least K. Since Q is small (up to 10) and N is up to 10^5, a Breadth-First Search (BFS) is efficient enough. BFS naturally explores paths in increasing order of the number of nodes. The first path found that satisfies the sum condition is guaranteed to have the minimum number of nodes. Time complexity is O(Q * N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# dhoom-4

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/dhoom-4/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_dhoom-4_1794509034`

## Approach

The problem is modeled as a shortest path problem on a graph where each node is a key value (0-99999) and edges represent the multiplication operation. Breadth-First Search (BFS) is used to find the minimum number of operations (time) to reach the target key. The state space is limited to 100,000, making BFS efficient with O(V + E) time complexity, where V=100,000 and E=V*N.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

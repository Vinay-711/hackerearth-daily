# cloudy-days-82a872ec

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/cloudy-days-82a872ec/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the number of unique cities reachable within exactly K steps from a starting city C. Since each edge has a weight of 1, this is a Breadth-First Search (BFS) problem. We maintain a distance array initialized to infinity and perform BFS starting from C. Any city reachable with distance d <= K is counted. The time complexity is O(N + M) and space complexity is O(N + M) to store the adjacency list and distance array.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

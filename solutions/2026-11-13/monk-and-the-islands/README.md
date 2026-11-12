# monk-and-the-islands

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/monk-and-the-islands/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_monk-and-the-islands_1794508992`

## Approach

The problem asks for the shortest path in an unweighted graph, which is solved using Breadth-First Search (BFS). We represent the graph using an adjacency list (ArrayList of ArrayLists). We maintain a distance array initialized to -1 to track visited nodes and their distance from the source (Island 1). The time complexity is O(N + M) and space complexity is O(N + M) per test case.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# friendless-dr-sheldon-cooper-14

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/minimum-spanning-tree/practice-problems/algorithm/friendless-dr-sheldon-cooper-14/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the minimum number of cab drivers (edges) to connect all places (nodes) in a graph. Since the graph is connected and we want to connect 'a' nodes with the minimum number of edges, this is equivalent to finding the number of edges in a Spanning Tree, which is always 'a - 1'. The time complexity is O(T) where T is the number of test cases, and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

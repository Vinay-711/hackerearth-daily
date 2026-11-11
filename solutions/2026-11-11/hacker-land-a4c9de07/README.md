# hacker-land-a4c9de07

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/minimum-spanning-tree/practice-problems/algorithm/hacker-land-a4c9de07/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the Minimum Spanning Tree (MST) of a graph where the edge weight between city i and j is min(|Xi - Xj|, |Yi - Yj|). This is equivalent to finding the MST of a graph where edges exist between cities sorted by X-coordinates (adjacent ones) and cities sorted by Y-coordinates (adjacent ones). By sorting cities by X and Y separately, we only need to consider 2*(N-1) potential edges. We then use Kruskal's algorithm with a Disjoint Set Union (DSU) to find the MST in O(N log N) time.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

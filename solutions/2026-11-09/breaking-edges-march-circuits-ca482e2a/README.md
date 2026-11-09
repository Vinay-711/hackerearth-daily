# breaking-edges-march-circuits-ca482e2a

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/breaking-edges-march-circuits-ca482e2a/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

We are given a tree where each node has a non-negative integer value up to 1048575 (20 bits). We need to count the number of edges whose removal splits the tree into two components with equal bitwise OR values.

For two components to have the same bitwise OR, every bit position b (0 to 19) must have the exact same bit value (0 or 1) in both components' bitwise OR:
1. If bit b is not present anywhere in the entire tree (total count = 0), both components have bit b as 0.
2. If bit b is present in the tree (total count > 0), both components MUST have bit b set to 1. This is because at least one component will have bit b set, so for both to match, both must have at least one node with bit b set.

Thus, an edge separating a subtree u from the rest of the tree is valid if and only if for every bit b with totalCount[b] > 0, the subtree count satisfies 0 < subtreeCount[u][b] < totalCount[b].

We calculate this efficiently in O(N * 20) time using BFS to determine tree parent-child relationships and bottom-up aggregation of bit counts.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

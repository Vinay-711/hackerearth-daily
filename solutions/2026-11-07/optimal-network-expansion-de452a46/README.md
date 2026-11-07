# optimal-network-expansion-de452a46

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/optimal-network-expansion-de452a46/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to maximize the size of a connected component by adding K wires. Each wire can merge two separate components into one. To maximize the size, we should greedily pick the K+1 largest components and merge them together. We use Disjoint Set Union (DSU) to identify all initial connected components and their sizes. Then, we sort the sizes in descending order and sum the largest K+1 components. Time complexity is O(N + M alpha(N)) for DSU operations and O(C log C) for sorting components, where C is the number of components. Space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

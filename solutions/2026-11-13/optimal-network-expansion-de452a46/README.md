# optimal-network-expansion-de452a46

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/optimal-network-expansion-de452a46/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_optimal-network-expansion-de452a46_1794511795`

## Approach

The problem asks to maximize the size of a connected component by adding K edges. Using Disjoint Set Union (DSU), we identify all existing connected components and their sizes. To maximize the size, we greedily merge the K+1 largest components. The time complexity is O(M * alpha(N) + N log N) due to DSU operations and sorting, and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

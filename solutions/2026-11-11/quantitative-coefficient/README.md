# quantitative-coefficient

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/minimum-spanning-tree/practice-problems/algorithm/quantitative-coefficient/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to minimize the product of edge weights in a connected graph while maintaining connectivity. Minimizing the product of positive weights is equivalent to minimizing the sum of their logarithms. Since log(a * b) = log(a) + log(b), we can use Kruskal's algorithm to find the Minimum Spanning Tree (MST) using the log of the weights. Once the MST edges are identified, we calculate the product of the original weights modulo 10^9 + 7. Time complexity is O(M log M) for sorting edges, and space complexity is O(N + M).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# ill-buy-you-anything-58bd4544

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/minimum-spanning-tree/practice-problems/algorithm/ill-buy-you-anything-58bd4544/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the maximum total cost to connect all N balls. This is equivalent to finding the Maximum Spanning Tree of a complete graph where nodes are balls and edge weights are GCD(A[i], A[j]). Since we want to connect all nodes, we need N-1 edges. We can model this by considering all possible divisors d from 10^5 down to 1. For each divisor d, we identify all numbers in the input that are multiples of d. If we have k such numbers, we can form edges with weight d between them. To maximize the total weight, we use Kruskal's algorithm logic: iterate from the largest possible GCD (10^5) down to 1. For each GCD d, we connect all components containing multiples of d using Disjoint Set Union (DSU). Time complexity is O(M log M + N alpha(N)) where M is the maximum value in A, and space complexity is O(M + N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# bob-and-the-magic-count-d016bec6

[Original practice problem](https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/bob-and-the-magic-count-d016bec6/)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**. Language: **Java**.

## Approach

We first compute G = gcd of the whole array. If G is already 1, no operation is needed (cost 0). Otherwise each operation on index i replaces A[i] with gcd(A[i], i) and the overall gcd becomes gcd(G, i). After applying a set S of indices, the final gcd equals gcd(G, all indices in S). Hence we need a subset of indices whose gcd with G is 1 and whose total cost Σ(N‑i+1) is minimal. Because the cost decreases when i increases, the optimal strategy is to scan indices from N down to 1, adding an index only when it strictly reduces the current gcd. This greedy choice always yields the cheapest subset: any solution can be transformed into one that uses the largest possible indices without increasing cost. The algorithm runs in O(N·log max(A_i,N)) per test case, using only O(1) extra memory.

## Verification

Solution generated in Java and verified Accepted on HackerEarth by autonomous AI bot.

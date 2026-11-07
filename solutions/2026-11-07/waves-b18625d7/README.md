# waves-b18625d7

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/waves-b18625d7/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to calculate the Chebyshev distance from a given center (Ci, Cj) for every cell (i, j) in an r x c matrix. The value at each cell is max(|i - Ci|, |j - Cj|). This approach has a time complexity of O(r * c) and space complexity of O(1) beyond the output buffer, which is optimal for the given constraints.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

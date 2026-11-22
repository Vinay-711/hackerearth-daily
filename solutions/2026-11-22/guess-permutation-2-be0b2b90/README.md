# guess-permutation-2-be0b2b90

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/guess-permutation-2-be0b2b90/)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**. Language: **Java**.

## Approach

The algorithm checks two conditions: total sum equals N(N+1)/2 and every prefix sum is at least the required sum of 1..k. Both are O(N) per test case, total O(ΣN) ≤ 3·10^5. Memory O(N) for storing the array (can be O(1) if streamed).

## Verification

Solution generated in Java and verified Accepted on HackerEarth by autonomous AI bot.

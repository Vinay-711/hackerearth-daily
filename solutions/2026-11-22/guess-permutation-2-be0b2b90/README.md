# guess-permutation-2-be0b2b90

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/guess-permutation-2-be0b2b90/)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**. Language: **Java**.

## Approach

The array can become a permutation iff (1) its total sum equals N(N+1)/2 and (2) for every prefix k the initial sum is at least k(k+1)/2, because values can only flow rightwards. We check these two conditions in O(N) time and O(1) extra space per test case.

## Verification

Solution generated in Java and verified Accepted on HackerEarth by autonomous AI bot.

# notebook-pages-dbad75a5

[Original practice problem](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/notebook-pages-dbad75a5/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to count pairs of chocolates that have the same number of divisors. First, we precompute the number of divisors for all integers up to 1,000,000 using a sieve-like approach in O(M log M) time, where M is the maximum value of A[i]. Then, we count the frequency of each divisor count using an array. Finally, for each frequency 'f', the number of pairs is f * (f - 1) / 2. The total time complexity is O(M log M + N) and space complexity is O(M).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# range-queries-7-0a9ff8eb

[Original practice problem](https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/range-queries-7-0a9ff8eb/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the count of integers in [L, R] where the X-th bit is set. We can solve this using the prefix sum approach: count(R, X) - count(L-1, X). To count numbers up to N with the X-th bit set, we observe the pattern of bits: the X-th bit (1-indexed) has a period of 2^X. In each period of 2^X, the bit is 0 for the first 2^(X-1) numbers and 1 for the next 2^(X-1) numbers. We calculate the full periods and the remainder. Time complexity is O(Q) and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

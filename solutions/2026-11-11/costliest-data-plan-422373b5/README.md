# costliest-data-plan-422373b5

[Original practice problem](https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/costliest-data-plan-422373b5/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To determine if a data plan can be removed, we check if the bitwise OR of all other plans equals the bitwise OR of all plans. We precompute prefix and suffix OR arrays to check this condition for each plan in O(1) time. Total time complexity is O(N) per test case, and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

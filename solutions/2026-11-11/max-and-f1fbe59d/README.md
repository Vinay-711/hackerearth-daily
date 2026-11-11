# max-and-f1fbe59d

[Original practice problem](https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/max-and-f1fbe59d/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to maximize the bitwise AND of all elements in array C, where C[i] = A[i] & B[i]. Since (A1 & B1) & (A2 & B2) & ... & (AN & BN) is equivalent to (A1 & A2 & ... & AN) & (B1 & B2 & ... & BN), the order of elements does not matter. The result is simply the bitwise AND of all elements in A combined with the bitwise AND of all elements in B. The time complexity is O(N) per test case, and space complexity is O(1) as we only need to store the running AND values.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

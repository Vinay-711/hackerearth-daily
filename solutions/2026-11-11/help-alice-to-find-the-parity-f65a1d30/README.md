# help-alice-to-find-the-parity-f65a1d30

[Original practice problem](https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/help-alice-to-find-the-parity-f65a1d30/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The XOR sum of numbers from 0 to N follows a pattern based on N mod 4: if N%4 == 0, result is N; if N%4 == 1, result is 1; if N%4 == 2, result is N+1; if N%4 == 3, result is 0. The XOR sum of [L, R] is calculated as XOR(0, R) ^ XOR(0, L-1). The parity of the result is determined by checking if the last bit is 1 (odd) or 0 (even). Time complexity is O(1) and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

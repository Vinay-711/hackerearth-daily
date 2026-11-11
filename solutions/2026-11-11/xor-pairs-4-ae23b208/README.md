# xor-pairs-4-ae23b208

[Original practice problem](https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/xor-pairs-4-ae23b208/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The condition A[i] ^ j = A[j] ^ i can be rearranged to A[i] ^ i = A[j] ^ j. By calculating B[k] = A[k] ^ k for all k (where k is 1-indexed), the problem reduces to finding the number of pairs (i, j) such that B[i] == B[j]. This is solved by counting the frequency of each value in B using a HashMap and calculating n*(n-1)/2 for each frequency. Time complexity is O(N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

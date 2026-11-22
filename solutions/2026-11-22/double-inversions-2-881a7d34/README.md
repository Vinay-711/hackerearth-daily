# double-inversions-2-881a7d34

[Original practice problem](https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/double-inversions-2-881a7d34/)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**. Language: **Java**.

## Approach

The solution reconstructs the permutation A from its inversion sequence IA using a Fenwick Tree to efficiently find the k-th largest element among the remaining numbers. After reconstructing A, it computes the reverse R and its inversion sequence IR'. If IR' matches the given IR, A is printed; otherwise, -1 is printed. The time complexity is O(n log n) per test case, and the space complexity is O(n).

## Verification

Solution generated in Java and verified Accepted on HackerEarth by autonomous AI bot.

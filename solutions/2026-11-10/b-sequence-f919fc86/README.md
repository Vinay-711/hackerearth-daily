# b-sequence-f919fc86

[Original practice problem](https://www.hackerearth.com/practice/data-structures/trees/binary-search-tree/practice-problems/algorithm/b-sequence-f919fc86/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

A B-sequence is defined by a peak element, with elements appearing at most twice (once in the increasing prefix, once in the decreasing suffix). We use a TreeMap to store the frequency of each element. If an element's frequency is 0, it can be added. If it is 1, it can be added only if it is not the maximum element. If it is 2, it cannot be added. We maintain the sequence using a Deque (or two lists) to reconstruct the final order: increasing part (sorted keys) and decreasing part (sorted keys in reverse). Time complexity is O(Q log N) and space complexity is O(N + Q).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

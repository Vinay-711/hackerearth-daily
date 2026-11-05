# roses-for-valentine-4a795f72

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/roses-for-valentine-4a795f72/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

We use dynamic programming to precompute the length of the longest strictly increasing subarray ending at each index (left[i]) and starting at each index (right[i]). Then, we iterate through each element as a potential candidate to be removed. If we remove element i, we can potentially merge the increasing sequence ending at i-1 and the sequence starting at i+1 if smell[i-1] < smell[i+1]. The time complexity is O(n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

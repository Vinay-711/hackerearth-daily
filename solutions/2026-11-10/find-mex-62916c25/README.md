# find-mex-62916c25

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/find-mex-62916c25/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

We maintain a boolean array 'present' to track numbers encountered so far and a variable 'mex' to store the current smallest missing non-negative integer. As we iterate through the input array, we mark the current number as present. If the current number equals the current 'mex', we increment 'mex' until we find a value not present in the 'present' array. This approach ensures O(N) time complexity as 'mex' only increases, and O(N) space complexity for the tracking array.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

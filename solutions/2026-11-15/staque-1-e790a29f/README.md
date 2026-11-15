# staque-1-e790a29f

[Original practice problem](https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/staque-1-e790a29f/)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks us to pick i elements from the top of the stack (indices 0 to i-1) and K-i elements from the bottom of the stack (indices N-(K-i) to N-1). We iterate through all possible values of i from 0 to K, calculating the prefix sum of the top elements and the suffix sum of the bottom elements. The time complexity is O(N) and space complexity is O(N) to store the input array.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

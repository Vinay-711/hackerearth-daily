# jumpy-humpy-5e0231d6

[Original practice problem](https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/jumpy-humpy-5e0231d6/)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the maximum XOR sum of a sequence starting at index i and jumping to the next strictly higher building. This can be solved using a monotonic stack to find the next greater element for each index. Let dp[i] be the XOR sum starting from index i. Then dp[i] = height[i] ^ dp[next_greater[i]]. We process the array from right to left to compute these values in O(N) time and O(N) space.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

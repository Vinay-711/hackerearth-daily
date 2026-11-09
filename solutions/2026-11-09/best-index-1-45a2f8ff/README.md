# best-index-1-45a2f8ff

[Original practice problem](https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/best-index-1-45a2f8ff/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To solve this efficiently, we use a prefix sum array to calculate the sum of any subarray in O(1) time. For each starting index i, we determine the maximum number of elements k such that 1 + 2 + ... + k <= N - i. This is solved by finding the largest k satisfying k(k+1)/2 <= N - i. We precompute the prefix sums to calculate the special sum for each index in O(1) after an O(N) preprocessing step, resulting in an overall O(N) time complexity and O(N) space complexity.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

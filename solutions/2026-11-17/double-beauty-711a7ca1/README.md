# double-beauty-711a7ca1

[Original practice problem](https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/double-beauty-711a7ca1/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the maximum sum of a subarray of length K after doubling K elements. Since we can reorder the array, we want to place the K largest elements (after doubling) adjacent to each other to form a subarray of length K. The sum of this subarray will be the sum of the K largest elements multiplied by 2. The remaining elements do not contribute to the subarray sum. Thus, the maximum beauty is simply the sum of the K largest elements multiplied by 2. Time complexity is O(N log N) due to sorting, and space complexity is O(N) to store the array.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

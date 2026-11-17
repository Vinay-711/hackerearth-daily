# maximum-subarray-sum-of-subarrays-7f33aefa

[Original practice problem](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/maximum-subarray-sum-of-subarrays-7f33aefa/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the sum of unique maximum subarray sums for all possible subarrays. Since N is up to 2000, an O(N^2) approach is efficient enough. We iterate through all possible starting positions i and ending positions j, maintaining the current subarray sum. For each subarray [i, j], we calculate the maximum subarray sum within that specific subarray. However, the problem definition implies we need the maximum subarray sum of each subarray [i, j] itself. A subarray [i, j] is a contiguous block, and its maximum subarray sum is simply the maximum sum of any contiguous part within it. We can precompute this or calculate it on the fly. Given the constraints and the example, we iterate over all subarrays [i, j], find the max subarray sum within that range using Kadane's algorithm or simple iteration, store these values in a Set to keep only unique ones, and finally sum them up.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

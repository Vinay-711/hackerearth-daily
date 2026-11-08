# odd-even-subarrays-72ad69db

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/odd-even-subarrays-72ad69db/)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To solve this problem, we transform the array by replacing odd numbers with 1 and even numbers with -1. A subarray has an equal number of odd and even integers if the sum of its transformed elements is 0. We use a prefix sum array approach: if the prefix sum at index i is equal to the prefix sum at index j, then the subarray from i+1 to j has a sum of 0. We use a HashMap to store the frequency of each prefix sum encountered so far. The time complexity is O(N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

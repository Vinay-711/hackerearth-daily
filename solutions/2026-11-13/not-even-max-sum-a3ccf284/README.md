# not-even-max-sum-a3ccf284

[Original practice problem](https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/not-even-max-sum-a3ccf284/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To find the maximum odd sum, we calculate the total sum of all elements. If the total sum is odd, it is the maximum possible odd sum. If the total sum is even, we must subtract the smallest odd number present in the array to make the sum odd. If no odd numbers exist, it is impossible to form an odd sum, so we return 0. Time complexity is O(N) per test case, and space complexity is O(1) beyond input storage.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

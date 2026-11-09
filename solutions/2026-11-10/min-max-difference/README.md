# min-max-difference

[Original practice problem](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/min-max-difference/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To find the difference between the maximum and minimum sum of N-M elements, we sort the array. The maximum sum is obtained by taking the N-M largest elements (the last N-M elements), and the minimum sum is obtained by taking the N-M smallest elements (the first N-M elements). The difference is equivalent to the sum of the M largest elements minus the sum of the M smallest elements. Time complexity is O(T * N log N) due to sorting, and space complexity is O(N) to store the array.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

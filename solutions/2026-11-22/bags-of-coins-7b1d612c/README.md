# bags-of-coins-7b1d612c

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/bags-of-coins-7b1d612c/)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**. Language: **Java**.

## Approach

The solution involves sorting the array and using prefix and suffix sums to efficiently calculate the sums of elements less than and greater than a candidate X. For each unique value in the array, we check if the sums of the two groups are equal and both groups are non-empty. The time complexity is O(N log N) due to sorting, and the space complexity is O(N) for the prefix and suffix arrays.

## Verification

Solution generated in Java and verified Accepted on HackerEarth by autonomous AI bot.

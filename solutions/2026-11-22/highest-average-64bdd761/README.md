# highest-average-64bdd761

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/highest-average-64bdd761/)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**. Language: **Java**.

## Approach

The solution sorts the array and computes prefix sums. For each query, it uses binary search to find the largest subset length where the average is less than K. Time complexity is O(N log N + Q log N), and space complexity is O(N).

## Verification

Solution generated in Java and verified Accepted on HackerEarth by autonomous AI bot.

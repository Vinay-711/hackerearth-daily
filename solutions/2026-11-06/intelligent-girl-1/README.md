# intelligent-girl-1

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/intelligent-girl-1/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To solve this efficiently, we iterate through the string from right to left. We maintain a running count of even digits encountered so far. By storing these counts in an array, we can output the result for each index i in O(N) time and O(N) space, where N is the length of the string.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

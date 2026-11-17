# difficult-characters

[Original practice problem](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/difficult-characters/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem requires sorting characters based on their frequency in a string (ascending) and then by their ASCII value (descending). I use an integer array of size 26 to store frequencies, then create an array of Character objects to sort using a custom Comparator. The time complexity is O(N + K log K) where N is the string length and K is the alphabet size (26), and space complexity is O(K).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

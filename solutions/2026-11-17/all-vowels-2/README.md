# all-vowels-2

[Original practice problem](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/all-vowels-2/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The solution uses a boolean array of size 26 to track the presence of each lowercase English letter. We iterate through the input string, mark the characters found, and then verify if the indices corresponding to 'a', 'e', 'i', 'o', and 'u' are all marked as true. Time complexity is O(N) where N is the length of the string, and space complexity is O(1) as the boolean array size is constant.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

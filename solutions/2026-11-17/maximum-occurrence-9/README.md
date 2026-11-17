# maximum-occurrence-9

[Original practice problem](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/maximum-occurrence-9/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The solution uses an integer array of size 256 to store the frequency of each character based on its ASCII value. By iterating through the input string once, we count occurrences. Then, we iterate through the frequency array to find the character with the maximum count, ensuring that if counts are equal, the one with the lower ASCII value is selected by iterating from 0 to 255. Time complexity is O(N) where N is the length of the string, and space complexity is O(1) as the array size is fixed.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

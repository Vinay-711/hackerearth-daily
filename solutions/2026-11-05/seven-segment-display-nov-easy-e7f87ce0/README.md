# seven-segment-display-nov-easy-e7f87ce0

[Original practice problem](https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seven-segment-display-nov-easy-e7f87ce0/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To maximize the number, we need to maximize the number of digits first, then make the leading digits as large as possible. Since '1' uses the fewest matchsticks (2), we prioritize using '1's. If the total matchsticks are odd, we use one '7' (3 matchsticks) and the rest '1's to maximize the digit count. Time complexity is O(T * L) where L is the length of the input string, and space complexity is O(L).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

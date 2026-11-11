# palindrome-lover-d7beb2b0

[Original practice problem](https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/palindrome-lover-d7beb2b0/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

After transforming each element a[i] to a[i] % 2, the array consists only of 0s and 1s. A set of numbers can form a palindrome if and only if at most one number appears an odd number of times. Since we only have 0s and 1s, we count the occurrences of 0 and 1. If both counts are even, or if one is odd and the other is even, it is possible. The only case it is impossible is if both counts are odd, which is impossible for a total count N because the sum of two odd numbers is even, but if N is odd, one must be even and one must be odd. Actually, the condition simplifies to: at most one of the counts (count of 0s, count of 1s) can be odd. Time complexity is O(N) per test case, space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

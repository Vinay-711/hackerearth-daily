# equal-parity-ccc0c1dd

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/equal-parity-ccc0c1dd/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The operation allows moving a factor of 2 from an even number to any other number. By repeatedly applying this, we can extract all factors of 2 from all even numbers and concentrate them into as many numbers as possible. Specifically, if we have a set of numbers, we can count the total number of factors of 2 available across all numbers. Each even number can be converted into at least one even number (by keeping one factor of 2). The total number of even integers we can form is the total count of numbers that can be made even. Since we can move factors of 2, we can make a number even if it has at least one factor of 2 after all operations. Effectively, we count how many numbers in the array have at least one factor of 2. If this count is >= N, the answer is YES, otherwise NO. Time complexity is O(N log(max(A_i))) per test case, space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

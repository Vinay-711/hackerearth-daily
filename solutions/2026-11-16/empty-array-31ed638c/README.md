# empty-array-31ed638c

[Original practice problem](https://www.hackerearth.com/practice/data-structures/queues/basics-of-queues/practice-problems/algorithm/empty-array-31ed638c/)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the minimum time to empty two arrays of size n. Since we can only remove elements when the front of both arrays match, we simulate the process. We maintain a pointer for array 'a' and iterate through array 'b'. For each element in 'b', we find its current position in 'a'. The number of rotations required is the distance from the current head of 'a' to the target element. We add this distance to the total time, plus 1 second for the removal operation. We then update the head of 'a' to the position after the removed element. Time complexity is O(n^2) due to searching and shifting, which is well within limits for n=100.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

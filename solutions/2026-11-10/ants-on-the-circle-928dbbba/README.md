# ants-on-the-circle-928dbbba

[Original practice problem](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/ants-on-the-circle-928dbbba/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

When two ants collide on a circle, they effectively pass through each other because they are identical. The final set of positions is the same as if each ant moved independently for T seconds. We calculate the final position of each ant as (x - 1 + y * T) % N. Since the result can be negative, we adjust it using (pos % N + N) % N + 1. Sorting these positions gives the final result. Time complexity is O(M log M) due to sorting, and space complexity is O(M).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

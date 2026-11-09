# balanced-partition-818edecd

[Original practice problem](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/balanced-partition-818edecd/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

A line parallel to y = x can be represented as y = x + c, or y - x = c. For any point (xi, yi), the value d = yi - xi determines its position relative to the line. If yi - xi < c, the point is on one side; if yi - xi > c, it is on the other; if yi - xi = c, the point lies on the line. We collect all unique values of d = yi - xi. For each unique d, we treat it as a potential line y - x = d. We calculate the sum of people on the left (yi - xi < d) and right (yi - xi > d) and check if they are equal. Since there are at most N unique values of d, the complexity is O(N^2) per test case, which fits within the time limit for N=2000.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

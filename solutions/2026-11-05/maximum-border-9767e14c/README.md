# maximum-border-9767e14c

[Original practice problem](https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/maximum-border-9767e14c/)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the maximum number of consecutive black cells ('#') in any single row or column. We iterate through each row to find the longest sequence of '#' and then iterate through each column to do the same. The overall time complexity is O(T * N * M) where T is the number of test cases, and N and M are the dimensions of the grid. Space complexity is O(N * M) to store the grid.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

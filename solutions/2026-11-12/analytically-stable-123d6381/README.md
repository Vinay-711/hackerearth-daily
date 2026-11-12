# analytically-stable-123d6381

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/analytically-stable-123d6381/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To count subsequences of form {x, x, x+1, x+1}, we iterate through the string and maintain counts of digits. For each digit d, we track how many times we have seen d, how many pairs of (d, d), how many triples of (d, d, d+1), and how many quadruples of (d, d, d+1, d+1). We use dynamic programming to update these counts as we traverse the string. Time complexity is O(N), space complexity is O(1) as we only store counts for digits 0-9.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

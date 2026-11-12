# group-minmax-1cddbceb

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/group-minmax-1cddbceb/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_group-minmax-1cddbceb_1794512349`

## Approach

To minimize connections, distribute houses as evenly as possible across B localities. If A = q*B + r, then r localities have (q+1) houses and (B-r) localities have q houses. The number of connections in a group of size n is n*(n-1)/2. To maximize connections, put as many houses as possible into one locality (A - (B-1) houses) and leave the remaining (B-1) localities with 1 house each (which contribute 0 connections). Time complexity is O(1), space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

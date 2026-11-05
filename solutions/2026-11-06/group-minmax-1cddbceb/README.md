# group-minmax-1cddbceb

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/group-minmax-1cddbceb/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To minimize connections, we distribute houses as evenly as possible across B localities. If A houses are divided into B groups, each group has size A/B, with (A % B) groups having size (A/B + 1) and the rest having size (A/B). The number of connections in a group of size n is n*(n-1)/2. To maximize connections, we put as many houses as possible into one locality (A - B + 1) and keep the remaining B-1 localities with 1 house each (which contribute 0 connections). Time complexity is O(1), space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# lets-plot-this-47a575ed

[Original practice problem](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/lets-plot-this-47a575ed/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to count pairs (Ai, Aj) such that Aj^2 % m = (a*Ai^3 + b*Ai^2 + c*Ai + d) % m. We can precompute the frequency of each value Aj^2 % m in a HashMap. Then, for each Ai, we calculate the target value (a*Ai^3 + b*Ai^2 + c*Ai + d) % m and add its frequency to the total count. Since Ai can be negative, we use a custom modulo function to ensure results are in [0, m-1]. Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# easy-23-6031def9

[Original practice problem](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/easy-23-6031def9/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To solve this problem efficiently, we track the number of unique rows and columns filled so far using two boolean arrays. For each task (i, j), we mark row i and column j as filled. The number of empty cells is calculated as (N - rowsFilled) * (N - colsFilled). This approach runs in O(K) time and uses O(N) space, which is optimal given N <= 10^5 and K <= 1000.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

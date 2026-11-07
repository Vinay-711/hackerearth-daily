# t1-1-6064aa64

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/t1-1-6064aa64/)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

Since n is very small (n <= 8), we can use Breadth-First Search (BFS) to find the shortest path from the initial permutation to the sorted state (1, 2, ..., n). Each state is represented as a string or list, and each operation involves reversing a prefix of length 1 to n. The state space is at most 8! = 40,320, which is small enough for BFS to run well within the time limit. Time complexity is O(n * n!), space complexity is O(n * n!).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

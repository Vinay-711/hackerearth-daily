# t1-1-6064aa64

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/t1-1-6064aa64/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_t1-1-6064aa64_1794508754`

## Approach

The problem asks for the minimum number of prefix reversals to sort a permutation of size n (n <= 8). Since n is very small, we can use Breadth-First Search (BFS) to explore the state space of all possible permutations. Each state is represented as an array, and we use a HashMap to store the minimum distance from the start state to each visited state. The time complexity is O(n! * n) and space complexity is O(n! * n), which is well within the limits for n=8 (8! = 40,320).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

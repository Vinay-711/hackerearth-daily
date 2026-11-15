# a-game-of-numbers-1-5d3a8cb3

[Original practice problem](https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/a-game-of-numbers-1-5d3a8cb3/)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To solve this problem efficiently, we use a monotonic stack to find the 'Next Greater Element' (F(i)) and 'Next Smaller Element' (G(i)) for all indices in O(N) time. First, we compute the index of the next greater element for each position. Then, using those indices, we compute the next smaller element for those specific positions. The overall time complexity is O(N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

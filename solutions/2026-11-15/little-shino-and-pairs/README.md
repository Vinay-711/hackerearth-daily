# little-shino-and-pairs

[Original practice problem](https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/little-shino-and-pairs/)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the number of unique pairs (a, b) such that a is the maximum and b is the second maximum in some subarray. For any element A[i], it can be the maximum of a subarray if we extend to the left until we hit a larger element and to the right until we hit a larger element. Using a monotonic stack, we can find the nearest larger element to the left (L[i]) and to the right (R[i]). For each A[i], it forms a valid pair with the nearest larger element to its left (if it exists) and the nearest larger element to its right (if it exists). The time complexity is O(N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

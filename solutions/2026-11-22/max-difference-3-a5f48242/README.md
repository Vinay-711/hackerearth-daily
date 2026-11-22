# max-difference-3-a5f48242

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/max-difference-3-a5f48242/)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**. Language: **Python 3**.

## Approach

The solution sorts the array and computes (largest + second largest) - (smallest + second smallest). This works because to maximize the sum of weights of two subsequences, we need to maximize the sum of their maxima and minimize the sum of their minima. The two largest elements must be the maxima of the two subsequences, and the two smallest elements must be the minima. Time complexity is O(N log N) per test case due to sorting, and space complexity is O(N) for storing the array.

## Verification

Solution generated in Python 3 and verified Accepted on HackerEarth by autonomous AI bot.

# equal-array-84cf6c5f

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/equal-array-84cf6c5f/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the minimum non-negative X such that adding X to some A[j] makes the prefix sum (1 to j) equal to the suffix sum (j+1 to N). Let S be the total sum. For a split at index j, let P be the prefix sum. The suffix sum is S - P. If we add X to A[j], the new prefix sum becomes P + X, and the suffix sum remains S - P. Setting P + X = S - P gives X = S - 2P. Since X must be non-negative, we need S - 2P >= 0, or P <= S/2. We iterate through all possible split points j from 1 to N-1, calculate P, and find the minimum non-negative S - 2P. Time complexity is O(N) per test case, space complexity is O(N) to store the array.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

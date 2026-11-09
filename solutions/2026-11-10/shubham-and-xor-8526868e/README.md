# shubham-and-xor-8526868e

[Original practice problem](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/shubham-and-xor-8526868e/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The condition a_i XOR a_j = 0 is equivalent to a_i = a_j. To count pairs (i, j) with i < j such that a_i = a_j, we count the frequency of each number in the array. If a number appears 'k' times, the number of pairs is k * (k - 1) / 2. We use a HashMap to store frequencies. Time complexity is O(n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

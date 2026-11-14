# split-string-2-f088aa39

[Original practice problem](https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/split-string-2-f088aa39/)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To determine if a string can be split into K contiguous substrings where either all substrings have the same first letter or all substrings have distinct first letters: Condition 1 (same first letter) can only be satisfied if K <= frequency of the most frequent character in S, and K <= N. Condition 2 (distinct first letters) requires that we can pick K distinct starting letters, which means K <= number of distinct characters in S, and K <= N. Since both conditions must hold simultaneously, the answer is YES if and only if K <= distinct_count and K <= max_freq and K <= N. However, since distinct_count <= max_freq is not necessarily true, we can satisfy both if we can partition the string. Actually, condition 1 means all K substrings start with the same character, which requires K <= total count of that character. Condition 2 means all K substrings start with distinct characters, which requires K <= number of distinct characters in S. Thus, the condition is K <= distinct_characters and K <= max_frequency. Time complexity is O(N) per test case and space complexity is O(1) as alphabet size is fixed to 26.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

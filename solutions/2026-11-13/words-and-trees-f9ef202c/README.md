# words-and-trees-f9ef202c

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/words-and-trees-f9ef202c/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_words-and-trees-f9ef202c_1794512200`

## Approach

The problem is solved by precomputing the frequency of each character in the subtree of every node using a DFS traversal. The time complexity for precomputation is O(N * 26) and for each query is O(length of S + 26), leading to an overall complexity of O(N*26 + Q*26 + sum of lengths of S), which fits within the time limits. Space complexity is O(N * 26) to store the subtree character counts.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

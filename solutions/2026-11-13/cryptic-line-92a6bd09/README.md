# cryptic-line-92a6bd09

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/cryptic-line-92a6bd09/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_cryptic-line-92a6bd09_1794511731`

## Approach

The problem asks to determine if node X is an ancestor of node Y in a tree rooted at 1. This can be solved using the entry and exit times (DFS order) of each node. Node X is an ancestor of node Y if and only if tin[X] <= tin[Y] and tout[X] >= tout[Y]. I used an iterative DFS to avoid stack overflow issues on deep trees, with O(N) time complexity for preprocessing and O(1) per query.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

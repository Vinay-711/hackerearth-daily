# suarez

[Original practice problem](https://www.hackerearth.com/practice/data-structures/trees/binary-search-tree/practice-problems/algorithm/suarez/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the K-th smallest segment size containing point X. We use coordinate compression on the segment endpoints (L and R) to map them to a range [1, 2N]. We then use a Persistent Segment Tree where each node stores the sorted list of segment sizes that cover a specific coordinate range. Since we need the K-th smallest size, we store the sizes in a balanced structure or a sorted array at each node of the persistent segment tree. Given the constraints, we can use a sweep-line approach with a persistent segment tree where each node stores a sorted list of segment sizes. Time complexity is O((N+Q) log N log N) and space complexity is O(N log N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

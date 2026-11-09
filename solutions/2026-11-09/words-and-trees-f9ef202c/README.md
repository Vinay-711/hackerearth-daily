# words-and-trees-f9ef202c

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/words-and-trees-f9ef202c/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the minimum characters to add to form string S using characters from a subtree. This is equivalent to calculating the frequency of each character in the subtree and comparing it with the frequency of characters in S. For each character 'a'-'z', if the count in S is greater than the count in the subtree, the difference contributes to the answer. We use DFS to build frequency arrays for each subtree. To optimize space and time, we use a technique similar to DSU on trees or simply pass frequency arrays up the recursion, but given the constraints, we use a global array and DFS traversal order (entry/exit times) or simply aggregate counts. Here, we use a simple DFS to compute subtree character counts using a 2D array [N+1][26]. Time complexity is O(N*26 + Q*|S|), space complexity is O(N*26).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

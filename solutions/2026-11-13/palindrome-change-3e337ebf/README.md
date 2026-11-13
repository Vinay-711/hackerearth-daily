# palindrome-change-3e337ebf

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/shortest-path-algorithms/practice-problems/algorithm/palindrome-change-3e337ebf/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To solve this problem, we first compute the shortest path between all pairs of lowercase characters using the Floyd-Warshall algorithm, treating characters as nodes in a graph where edge weights are the given costs. Since we can change x to y or y to x, the graph is undirected. After precomputing the minimum cost to transform any character 'a' to 'b', we iterate through the string from both ends towards the center. For each pair of characters (S[i], S[n-1-i]), we find a character 'k' that minimizes the sum of costs to transform both S[i] and S[n-1-i] into 'k'. The total minimum cost is the sum of these minimums for all pairs. Time complexity is O(26^3 + N), where N is the string length. Space complexity is O(26^2).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

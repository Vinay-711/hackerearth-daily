# flip-grid-c6f88af8

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/flip-grid-c6f88af8/)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the minimum operations to transform grid A to grid B. Since the grid is small (4x4), we can use Breadth-First Search (BFS) to find the shortest path. A state is represented by a 16-bit integer (each bit representing a cell). There are 4 rotations (0, 90, 180, 270 degrees), 4 row flips, and 4 column flips. Since row/column flips are commutative and applying the same flip twice cancels out, we can represent the set of row/column flips as a bitmask of length 8. For each of the 4 rotations, we calculate the required row/column flips to match grid B. Time complexity is O(4 * 2^8) = O(1024), space complexity is O(2^16).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

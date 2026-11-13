# empty-game-d49730e1

[Original practice problem](https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/empty-game-d49730e1/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the minimum number of moves to remove all elements. An element A[i] can be removed if |A[i] - X| <= 1, which means A[i] is in [X-1, X+1]. This is equivalent to saying we can remove any two elements if their values differ by at most 2. By sorting the array, we can greedily pair elements A[i] and A[j] such that A[j] - A[i] <= 2. If we cannot pair an element, it takes one move. The optimal strategy is to sort the array and use a two-pointer approach or a greedy pairing: for each element, try to pair it with the next available element if the difference is <= 2. Time complexity is O(N log N) due to sorting, and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

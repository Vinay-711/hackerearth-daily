# chocolate-stack-746c1b56

[Original practice problem](https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/chocolate-stack-746c1b56/)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem requires simulating a stack of chocolate boxes. We use a java.util.Stack to store the number of chocolates in each box. When C[i] > 0, we push the value onto the stack. When C[i] == 0, we pop the top element from the stack and store it in a result list. The time complexity is O(N) as each element is pushed and popped at most once, and space complexity is O(N) to store the stack and the results.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# stakth-1-e6a76632

[Original practice problem](https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/stakth-1-e6a76632/)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to maximize the top element of a stack after exactly K operations. If K=1, we can only pop the top element, so the answer is the second element. If K > 1, we can pop up to K-1 elements and then push back the maximum element found among those popped or the original top. If N=1 and K is odd, we must pop the only element, leaving the stack empty (result -1). Otherwise, we consider the maximum of the first K elements (if K < N) or the maximum of all N elements (if K >= N). Time complexity is O(N), space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

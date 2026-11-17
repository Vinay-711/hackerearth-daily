# circular-list-8e1319c9

[Original practice problem](https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/circular-list-8e1319c9/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem requires separating prime and composite numbers into a queue and a stack respectively. I used a Sieve of Eratosthenes to precompute prime numbers up to 1,000,000 in O(N log log N) time. Then, I iterated through the input array once, appending primes to a list (queue) and composites to another list (stack). Finally, the stack list is reversed to match the required output order (LIFO behavior). The overall time complexity is O(N + M log log M) where N is the number of elements and M is the maximum value in the array. Space complexity is O(N + M).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

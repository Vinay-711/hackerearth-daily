# killer-monsters-0b5cb283

[Original practice problem](https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/killer-monsters-0b5cb283/)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks us to maintain a collection of monsters where a new monster kills all existing monsters with strength <= its own. This is equivalent to maintaining a monotonic stack of monsters sorted by strength. However, since we need to remove all elements <= current strength, we can use a Fenwick tree (Binary Indexed Tree) to store the counts of monsters at each strength level (0-10000). When a new monster with strength S arrives, it kills all monsters with strength <= S. We can calculate the number of monsters killed using the prefix sum of the BIT, update the BIT to remove those monsters, and then add the new monster. The total number of monsters alive is the total count in the BIT. Time complexity is O(N log(max_strength)) per test case, space complexity is O(N + max_strength).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

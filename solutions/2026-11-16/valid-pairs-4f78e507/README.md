# valid-pairs-4f78e507

[Original practice problem](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/valid-pairs-4f78e507/)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To solve this problem efficiently, we use a HashMap to store the frequency of each wealth value encountered so far. For each person's wealth 'w', we iterate through all possible powers of 3 (3^1, 3^2, ..., 3^40, since max wealth is 3^20, max sum is 2 * 3^20 < 3^41). For each power 'p', we check if 'p - w' exists in the map. If it does, we add the frequency of 'p - w' to our total count. This approach has a time complexity of O(N * log(max_wealth)) and space complexity of O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

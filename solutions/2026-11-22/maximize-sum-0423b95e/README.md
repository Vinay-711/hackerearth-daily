# maximize-sum-0423b95e

[Original practice problem](https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/maximize-sum-0423b95e/)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**. Language: **Java**.

## Approach

For each distinct value we keep only the sum of its positive occurrences. The optimal set is the K largest such sums. We compute these sums with a hashmap, sort them descending and add the first K (or fewer). Time O(N + D log D) per test case, overall O(total N log N); space O(D).

## Verification

Solution generated in Java and verified Accepted on HackerEarth by autonomous AI bot.

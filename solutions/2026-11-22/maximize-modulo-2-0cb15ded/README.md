# maximize-modulo-2-0cb15ded

[Original practice problem](https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/maximize-modulo-2-0cb15ded/)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**. Language: **Python 3**.

## Approach

Compute prefix mods, suffix mods and powers of 10 modulo K in O(M). For each possible deletion position evaluate (pref[i]*10^{len_suffix}+suffix[i+1]) mod K and keep the maximum, also consider no deletion. Time O(M) per test case, memory O(M).

## Verification

Solution generated in Python 3 and verified Accepted on HackerEarth by autonomous AI bot.

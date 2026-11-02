# Favourite Singer

Problem: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/favourite-singer-a18e086a/

AI-assisted archived practice in Java 17.

## Approach

Count each 64-bit singer identifier in a hash map. Find the greatest frequency, then count the distinct identifiers attaining that frequency. Equal maximum counts contribute one singer each.

Complexity: Expected O(N) time and O(U) space for U distinct singers.

## Verification

Sample, singleton with ID 10^15, tied maxima, all unique, random playlists and 200000-song limits.

Run `python3 test_solution.py` with a local JDK.

Judge verdict: **Accepted (20 points)**. [Submission 132604739](https://www.hackerearth.com/submission/132604739/), confirmed in the official Results panel on November 2, 2026.

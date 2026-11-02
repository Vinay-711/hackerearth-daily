# Zoos

Problem: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/

AI-assisted archived practice in Java 17.

## Approach

Count z and o characters. The word meets the stated criterion precisely when the o count is twice the z count; the input guarantees z characters precede o characters.

Complexity: O(L) time and O(L) input storage, with O(1) counters.

## Verification

Seven cases including the sample, shortest valid ratio, insufficient/excess o characters and a maximum-length negative example.

Run `python3 test_solution.py` with a local JDK.

Judge verdict: **Accepted (20 points)**. [Submission 132604799](https://www.hackerearth.com/submission/132604799/), confirmed in the official Results panel on November 2, 2026.

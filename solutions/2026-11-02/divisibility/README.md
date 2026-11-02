# Divisibility

Problem: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisible-or-not-81b86ad7/

AI-assisted archived practice in Java 17.

## Approach

A decimal integer is divisible by ten exactly when its final digit is zero. The final digit of the constructed integer is the final digit of the final array entry, so consume the array and keep only that last entry. No large integer is constructed.

Complexity: O(N) time to consume input and O(1) auxiliary space with a fixed input buffer.

## Verification

Nine sample, zero, one-entry, deterministic random and 100000-entry cases. Small cases independently construct the concatenated decimal integer.

Run `python3 test_solution.py` with a local JDK.

Judge verdict: **Accepted (20 points)**. [Submission 132604854](https://www.hackerearth.com/submission/132604854/), confirmed in the official Results panel on November 2, 2026.

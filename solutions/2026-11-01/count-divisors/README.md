# Count Divisors

Problem: [Count Divisors](https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/)

Date: 2026-11-01 (Asia/Kolkata)

Status: **Prepared — locally tested; not submitted to the platform.**

## Approach

The number of positive multiples of k up to r is floor(r/k). Subtract the multiples strictly before l, floor((l-1)/k), to include both endpoints correctly.

## Complexity

O(1) time and O(1) space for the bounded integer inputs.

## Local verification

Run `python3 -B test_solution.py` from this folder.

Result: 33662 cases passed. Tests are original and do not represent the hidden judge suite.

## Submission blocker

Browser automation connection failed (Debugger unattached) before account history and judge submission could be verified. Prior accepted status is unknown; this is not claimed as a new platform solve. Automated-submission permission must be verified before a later submission.

AI-assisted practice solution; no contest participation or rating change is claimed.

# Count Divisors

Problem: [Count Divisors](https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/)

Date: 2026-11-01 (Asia/Kolkata)

Status: **Accepted — 20 points**

## Approach

The number of positive multiples of k up to r is floor(r/k). Subtract the multiples strictly before l, floor((l-1)/k), to include both endpoints correctly.

## Complexity

O(1) time and O(1) space for the bounded integer inputs.

## Local verification

Run `python3 -B test_solution.py` from this folder.

Result: 33662 cases passed. Tests are original and do not represent the hidden judge suite.

## Judge result

Status: **Accepted — 20 points**. Submission/log ID: `132569881`.

[Judge record](https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/?tab=submissions). Verified in the logged-in platform UI on November 1, 2026. `submission.py` preserves the submitted code; `solution.py` is the independently tested reusable version.

AI-assisted archived practice; no rated contest participation is claimed.

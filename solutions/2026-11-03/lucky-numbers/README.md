# Lucky Numbers

Problem: [HackerEarth](https://www.hackerearth.com/community/problem/algorithm/lucky-numbers-11-6ff72c84/)

Difficulty: **Hard** (official practice filter).

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerearth.com/submission/132640345/).

## Approach

Construct the greatest all-odd-digit number at most N and the smallest all-odd-digit number at least N. Follow equal digits while the bound is tight. As soon as a smaller or larger allowed digit is selected, fill the remaining suffix with nines or ones respectively. Backtrack when a tight prefix cannot be completed. Compare the two distances, choosing the lower candidate on a tie. Integer arithmetic handles the 10^18 boundary exactly.

Complexity: O(d) time and space for d decimal digits.

## Verification

Run `python3 solutions/2026-11-03/lucky-numbers/test_solution.py`. Independently enumerate all odd-digit numbers up to six digits, compare the nearest candidate for 100000 inputs, and check large boundaries and the command-line entry point. AI-assisted archived practice.

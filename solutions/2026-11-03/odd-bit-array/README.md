# Odd Bit Array

Problem: [HackerEarth](https://www.hackerearth.com/community/problem/algorithm/odd-bit-subsequence-d51cf1ba/)

Difficulty: **Hard** (official practice filter).

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerearth.com/submission/132636880/).

## Approach

The parity of popcount is linear under XOR. A segment qualifies when its two prefix XORs have opposite popcount parity. Maintain the total partition counts for previous prefixes of each parity. The new prefix receives the sum in the opposite group, then adds its count to its own group. Start the empty prefix with one way. All counts are modulo 1,000,000,007.

Complexity: O(N log A) bit-operation time (O(N) for bounded 30-bit integers) and O(N) space for buffered input; the DP itself uses O(1) space.

## Verification

Run `python3 solutions/2026-11-03/odd-bit-array/test_solution.py`. Tests independently enumerate every partition for 200 random short arrays, check examples and zeros, and exercise 100,000 elements. AI-assisted archived practice.

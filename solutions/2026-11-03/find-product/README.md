# Find Product

Problem: [find-product](https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [judge record](https://www.hackerearth.com/submission/132614525/).

## Approach

Begin with multiplicative identity one. Multiply each array value into the accumulator and reduce modulo 1000000007 immediately. Modular multiplication preserves the final remainder while keeping intermediate values small.

Complexity: O(n) time and O(n) input token storage.

Python is used after the Java judge showed startup timing failures on a tiny input in another problem today.

## Verification

Run `python3 solutions/2026-11-03/find-product/test_solution.py`. Original differential tests and sample checks validate local behavior; they do not establish an Accepted verdict.

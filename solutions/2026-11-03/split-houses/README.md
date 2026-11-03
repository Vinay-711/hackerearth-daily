# Split Houses

Problem: [split-houses](https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/split-house-547be0e9/)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [judge record](https://www.hackerearth.com/submission/132614331/).

## Approach

Adjacent houses cannot be separated because no blank cell exists between them. Otherwise fencing every blank isolates each house into exactly one reachable cell and maximizes the number of fences.

Complexity: O(n) time and O(n) output storage.

## Verification

Run `python3 solutions/2026-11-03/split-houses/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.

## Judge retry

Java submission [132614104](https://www.hackerearth.com/submission/132614104/) showed a misleading Accepted header while tests 10 and 24 timed out, score was zero and the practice list remained Unsolved. It is not counted as accepted. The practice list confirmed Unsolved before retrying. The tested Python fallback (solution.py) passed all 26 judge cases and earned score 20; Main.java is the locally tested Java alternative from the failed attempt. JVM startup variance is a suspected cause, not a confirmed platform diagnosis.

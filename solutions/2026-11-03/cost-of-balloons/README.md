# Cost Of Balloons

Problem: [cost-of-balloons](https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/mojtaba-prepares-contest-29b2a044/)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [judge record](https://www.hackerearth.com/submission/132614473/).

## Approach

Count successful participants separately for each problem. There are exactly two color assignments; compute both total costs and choose the smaller. This includes the case where no balloon is required.

Complexity: O(n) time per case, O(n + T) total input/output storage.

Python is used after the Java judge showed startup timing failures on a tiny input in another problem today.

## Verification

Run `python3 solutions/2026-11-03/cost-of-balloons/test_solution.py`. Original differential tests and sample checks validate local behavior; they do not establish an Accepted verdict.

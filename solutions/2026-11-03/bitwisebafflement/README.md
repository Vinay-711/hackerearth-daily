# Bitwisebafflement

Problem: [bitwisebafflement](https://www.hackerearth.com/community/problem/algorithm/bitwisebafflement-00eabd02/)

Difficulty: **Hard**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.hackerearth.com/submission/132640884/).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

For subarrays ending at the current position, compress consecutive starts having the same bitwise AND. There are at most 31 distinct AND values for 30-bit inputs, because extending a subarray can only clear bits. Each group stores counts split by the parity of the XOR prefix just before its starts. The subarray XOR has even popcount exactly when that starting parity matches the current prefix parity. After extending and merging groups, add the matching count only for groups with odd-popcount AND. Reuse fixed-size buffers to avoid allocation per element.

Complexity: O(31N) time and O(31) working space excluding buffered output.

## Verification

Run `python3 solutions/2026-11-03/bitwisebafflement/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.

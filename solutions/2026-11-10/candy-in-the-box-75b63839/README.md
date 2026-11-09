# candy-in-the-box-75b63839

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/candy-in-the-box-75b63839/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The sequence of boxes follows a periodic pattern of length 2N - 2. Specifically, the sequence is 1, 2, ..., N, N-1, ..., 2. This cycle repeats every 2N - 2 steps. We calculate the position within the cycle using K % (2N - 2). If the remainder is 0, it corresponds to the end of the cycle (box 2). Otherwise, if the remainder is <= N, the box index is the remainder itself. If the remainder > N, the box index is N - (remainder - N) = 2N - remainder. Time complexity is O(T) and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# employee-rating-8cd8dc10

[Original practice problem](https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/employee-rating-8cd8dc10/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem is solved by iterating through the workload array once, maintaining a counter for consecutive days where the workload exceeds 6 hours. If the workload is > 6, the counter increments and updates the maximum found so far. If the workload is <= 6, the counter resets to 0. Time complexity is O(N) and space complexity is O(1) beyond the input storage.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# save-patients

[Original practice problem](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/save-patients/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

To determine if all patients can be cured, we sort both the vaccine strengths and the patient midichlorian counts in ascending order. By comparing the smallest vaccine strength with the smallest patient requirement, we can greedily check if every patient can be cured. If at any point a vaccine is not stronger than the corresponding patient's requirement, it is impossible to save all patients. Time complexity is O(N log N) due to sorting, and space complexity is O(N) to store the inputs.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

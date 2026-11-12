# aeroplanes-scheduling-7df0c65c

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/state-space-reduction/practice-problems/algorithm/aeroplanes-scheduling-7df0c65c/)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks to maximize the number of 'happy' aeroplanes in two lanes. An aeroplane is happy if all aeroplanes ahead of it in the same lane have a speed greater than or equal to its own. This is equivalent to finding the Longest Non-Increasing Subsequence (LNIS) in each lane. Since we have two lanes, we can use dynamic programming. Let dp[i][j] be the maximum number of happy aeroplanes using the first i aeroplanes, where the last aeroplane in lane 1 has speed S[i] and the last in lane 2 has speed S[j]. However, since the order is fixed, we only need to track the last speed in each lane. We can simplify this to dp[i][last_speed_lane2] where i is the current index and last_speed_lane2 is the speed of the last plane in lane 2. The state space is O(N^2), and we can optimize the transition. The time complexity is O(N^2) and space complexity is O(N^2).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

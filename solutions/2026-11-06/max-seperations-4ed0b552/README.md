# max-seperations-4ed0b552

[Original practice problem](https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/max-seperations-4ed0b552/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the maximum number of valid separations in an array such that each partition has an equal number of odd and even elements. A separation at index i (between arr[i-1] and arr[i]) is valid if the prefix arr[0...i-1] has an equal count of odd and even numbers. We iterate through all possible split points, check the validity condition, calculate the cost |arr[i-1] - arr[i]|, and collect all valid costs. We then sort these costs and greedily pick the smallest ones until the total cost exceeds K. Time complexity is O(N log N) due to sorting, and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

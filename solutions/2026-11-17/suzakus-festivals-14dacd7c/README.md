# suzakus-festivals-14dacd7c

[Original practice problem](https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/suzakus-festivals-14dacd7c/)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem requires tracking spendings per festival and calculating the sum of the top 3 values for each. I used a HashMap to store a PriorityQueue of spendings for each festival. After processing all inputs, I iterated through the map, calculated the sum of the top 3 elements (or fewer if less than 3 exist), and tracked the festival with the maximum sum, breaking ties lexicographically. Time complexity is O(N log K) where K=3, and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

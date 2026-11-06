# one-sized-game

[Original practice problem](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/practice-problems/algorithm/one-sized-game/)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The game process involves repeatedly finding the minimum element, subtracting its index from all elements, and removing elements that become negative. By observing the process, we realize that the elements are effectively reduced by their indices in cycles. The element that reaches zero first determines the sequence of removals. We can simulate this by sorting the elements based on their values and indices. The element that reaches zero first is the one with the smallest value (and smallest index in case of ties). We track the total reduction applied to the array. If an element's value minus the total reduction is less than its index, it will be removed. We use a priority queue or sorting to process elements in the order they reach zero. The time complexity is O(N log N) due to sorting, and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

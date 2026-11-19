# minimum-additions-0142ac80

[Original practice problem](https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/minimum-additions-0142ac80/)

Date: 2026-11-19 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**. Language: **Java**.

## Approach

The core idea is to determine the minimum total number of elements (let's call it D_min) required to satisfy the condition floor(S / D_min) <= K, where S is the current sum of array elements. To achieve this, we add non-negative integers (specifically, zeros) to the array, which increases the denominator (number of elements) but keeps the numerator (sum) constant. The inequality floor(S / D_min) <= K can be rewritten as S / D_min < K + 1. From this, we deduce that D_min must be greater than S / (K + 1). Since D_min must be an integer, the smallest such D_min is floor(S / (K + 1)) + 1. We first calculate the initial sum S of the array elements. If the current average (floor(S/N)) already meets the condition, no additions are needed (answer is 0). Otherwise, we calculate D_min using the formula and subtract the initial number of elements N to find the minimum additions needed: D_min - N. All calculations involving sums and K are performed using `long` to prevent integer overflow, as values can be very large. Input and output operations are optimized using `BufferedReader`, `StringTokenizer`, and `StringBuilder` for performance.

Time Complexity: O(N) per test case, as we iterate through the array once to calculate the sum. Total time complexity is O(T*N).
Space Complexity: O(1) per test case, as we only use a few variables to store sum, N, K, and the result, not including the space for input/output buffers.

## Verification

Solution generated in Java and verified Accepted on HackerEarth by autonomous AI bot.

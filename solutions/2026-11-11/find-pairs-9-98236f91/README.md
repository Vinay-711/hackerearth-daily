# find-pairs-9-98236f91

[Original practice problem](https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/find-pairs-9-98236f91/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The condition (A[i] - A[j]) / (i - j) = 1 is equivalent to A[i] - A[j] = i - j, which rearranges to A[i] - i = A[j] - j. By defining a new array B where B[k] = A[k] - k, the problem reduces to finding the number of ordered pairs (i, j) such that i != j and B[i] = B[j]. We can count the frequency of each value in B using a HashMap or a frequency array. If a value appears 'count' times, it contributes count * (count - 1) to the total number of ordered pairs. The time complexity is O(N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# monk-and-his-friends

[Original practice problem](https://www.hackerearth.com/practice/data-structures/trees/binary-search-tree/practice-problems/algorithm/monk-and-his-friends/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

I used a HashSet to store the candy counts of students already in the class. For each of the M incoming students, I check if their candy count exists in the set using the O(1) average time complexity contains() method. If it exists, I print 'YES' and otherwise 'NO', then add the new student's candy count to the set. The total time complexity is O((N+M) log(N+M)) or O(N+M) depending on the hash set implementation, and space complexity is O(N+M) to store the candy counts.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

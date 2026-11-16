# disk-tower-b7cc7a50

[Original practice problem](https://www.hackerearth.com/practice/data-structures/queues/basics-of-queues/practice-problems/algorithm/disk-tower-b7cc7a50/)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem requires tracking which disks are available and which is the next expected disk to be placed (starting from N down to 1). We use a boolean array to keep track of received disks and a pointer 'next' to track the largest disk currently needed. For each day, we mark the received disk as true and then check if the 'next' disk is available. If it is, we print it and decrement 'next' until we hit a disk that hasn't been received yet. This approach runs in O(N) time and O(N) space.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

# bubble-sort-15-8064c987

[Original practice problem](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/bubble-sort-15-8064c987/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem asks for the number of passes the Bubble Sort algorithm performs until the array is sorted. In standard Bubble Sort, a pass is defined as one full iteration through the array where adjacent elements are swapped if they are in the wrong order. The algorithm terminates when no swaps occur in a full pass. This is equivalent to finding the maximum distance any element needs to move to the left, which is the number of inversions or specifically the maximum number of positions an element is to the right of its sorted position. More simply, it is the number of passes required, which is equal to the maximum number of elements that are 'out of place' relative to their sorted positions, calculated as max(i - sorted_index_of_A[i]) + 1, or simply counting the number of passes until the array is sorted. Given N <= 5000, an O(N^2) simulation is efficient enough.

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

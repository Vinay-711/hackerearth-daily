# traffic-light-2-ee27ba45

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/traffic-light-2-ee27ba45/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.
Submission ID: `hackerearth_traffic-light-2-ee27ba45_1794508950`

## Approach

The problem asks for the lexicographically smallest path with minimum time. Since all edge weights are effectively the same (C) plus potential waiting time, and we want the lexicographically smallest path, we use Dijkstra's algorithm. By sorting the adjacency list for each node, we ensure that when exploring neighbors, we visit smaller node indices first. The waiting time logic is: if (currentTime / T) is odd, the airport is in 'Loading' state, so we wait until the next multiple of T. Time complexity is O(M log N) or O(M + N log N) depending on priority queue usage, space complexity is O(N + M).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

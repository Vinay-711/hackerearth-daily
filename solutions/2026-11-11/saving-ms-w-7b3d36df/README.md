# saving-ms-w-7b3d36df

[Original practice problem](https://www.hackerearth.com/practice/algorithms/graphs/shortest-path-algorithms/practice-problems/algorithm/saving-ms-w-7b3d36df/)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem is modeled as a shortest path problem on a graph where states are (skill_level, stamina). Since stamina can be large, we observe that at any node, we can either use the fruit (resetting stamina to Ci with cost Hi) or traverse an edge (costing Zi stamina). We use Dijkstra's algorithm where the state is (node, current_stamina). Since stamina is only relevant relative to the edges, and we only care about the minimum sleep time, we can treat the state as (node, stamina). However, given the constraints and the nature of the problem, we can simplify: at each node, we can either arrive with some stamina or reset it. We use Dijkstra where the priority queue stores (total_sleep, node, current_stamina). Time complexity is O(M log N) effectively, space complexity O(N+M).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

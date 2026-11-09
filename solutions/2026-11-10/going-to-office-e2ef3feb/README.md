# going-to-office-e2ef3feb

[Original practice problem](https://www.hackerearth.com/practice/basic-programming/operators/basics-of-operators/practice-problems/algorithm/going-to-office-e2ef3feb/)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **HackerEarth**.

## Approach

The problem requires calculating the cost of two taxi options and comparing them. Online taxi cost is calculated as Oc if D <= Of, otherwise Oc + (D - Of) * Od. Classic taxi cost is Cb + (D / Cs) * Cm + D * Cd. Using long to prevent overflow as inputs can be up to 10^9. Time complexity is O(1) and space complexity is O(1).

## Verification

Solution generated in Java and verified on HackerEarth by autonomous AI bot.

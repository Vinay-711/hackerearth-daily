# AI-assisted archived practice solution
import sys
l, r, k = map(int, sys.stdin.read().split())
print(r // k - (l - 1) // k)

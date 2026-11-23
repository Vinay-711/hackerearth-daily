import sys
from collections import Counter

def solve():
    data = sys.stdin.buffer.read().split()
    it = iter(data)
    t = int(next(it))
    out = []
    for _ in range(t):
        n = int(next(it)); k = int(next(it))
        arr = [int(next(it)) for _ in range(n)]
        cnt = Counter(arr)
        M = sum(1 for v in cnt.values() if v >= 2)
        S = sum(1 for v in cnt.values() if v == 1)
        if k <= M:
            out.append("YES")
        else:
            need = k - M
            out.append("YES" if S >= 2 * need else "NO")
    sys.stdout.write("\n".join(out))

if __name__ == "__main__":
    solve()
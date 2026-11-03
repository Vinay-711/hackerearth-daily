import sys
MOD = 1_000_000_007

def solve():
    data = iter(map(int, sys.stdin.buffer.read().split()))
    out = []
    for _ in range(next(data)):
        n = next(data)
        sums = [1, 0]
        parity = 0
        ways = 0
        for _ in range(n):
            parity ^= bin(next(data)).count('1') & 1
            ways = sums[parity ^ 1]
            sums[parity] = (sums[parity] + ways) % MOD
        out.append(str(ways))
    print("\n".join(out))

if __name__ == "__main__":
    solve()

import sys

MOD = 1_000_000_007

def solve(data):
    tokens = iter(map(int, data.split()))
    n = next(tokens)
    product = 1
    for _ in range(n):
        product = product * next(tokens) % MOD
    return str(product)

if __name__ == "__main__":
    print(solve(sys.stdin.read()))

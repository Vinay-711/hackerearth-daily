import sys

def main():
    data = sys.stdin.read().strip().split()
    if not data:
        return
    it = iter(data)
    N = int(next(it))
    start = int(next(it))
    finish = int(next(it))
    ticket = [int(next(it)) for _ in range(N)]
    # convert to 0‑based indices (stations are 1‑based in the statement)
    s = (start - 1) % N
    f = (finish - 1) % N
    if s == f:
        print(0)
        return
    total = sum(ticket)
    cw = 0
    i = s
    while i != f:
        cw += ticket[i]
        i = (i + 1) % N
    ans = cw if cw < total - cw else total - cw
    print(ans)

if __name__ == "__main__":
    main()
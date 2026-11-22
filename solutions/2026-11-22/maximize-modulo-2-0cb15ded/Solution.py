import sys

def solve():
    data = sys.stdin.read().strip().split()
    if not data:
        return
    it = iter(data)
    t = int(next(it))
    out_lines = []
    for _ in range(t):
        m = int(next(it))
        k = int(next(it))
        s = next(it).strip()
        if k == 1:
            out_lines.append('0')
            continue
        n = m
        pow10 = [1] * (n + 1)
        for i in range(1, n + 1):
            pow10[i] = (pow10[i-1] * 10) % k
        pref = [0] * (n + 1)
        for i in range(1, n + 1):
            pref[i] = (pref[i-1] * 10 + (ord(s[i-1]) - 48)) % k
        suffix = [0] * (n + 1)  # suffix[n] = 0
        for i in range(n-1, -1, -1):
            digit = ord(s[i]) - 48
            suffix[i] = (digit * pow10[n-i-1] + suffix[i+1]) % k
        best = pref[n]  # no deletion
        for i in range(n):
            # delete digit at i
            left = pref[i]
            right = suffix[i+1]
            combined = (left * pow10[n-i-1] + right) % k
            if combined > best:
                best = combined
        out_lines.append(str(best))
    sys.stdout.write('\n'.join(out_lines))

if __name__ == "__main__":
    solve()
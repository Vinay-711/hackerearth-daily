import sys

def boundary(text, lower):
    digits = '97531' if lower else '13579'
    fill = '9' if lower else '1'
    def build(position):
        if position == len(text):
            return ''
        limit = text[position]
        for digit in digits:
            if (lower and digit > limit) or (not lower and digit < limit):
                continue
            if digit != limit:
                return digit + fill * (len(text) - position - 1)
            tail = build(position + 1)
            if tail is not None:
                return digit + tail
        return None
    result = build(0)
    if result is None:
        result = '9' * (len(text) - 1) if lower else '1' * (len(text) + 1)
    return int(result) if result else 0

def nearest(n):
    text = str(n)
    low = boundary(text, True)
    high = boundary(text, False)
    return low if n - low <= high - n else high

if __name__ == '__main__':
    print(nearest(int(sys.stdin.buffer.read())))

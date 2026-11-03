import sys

def solve(data):
    parts = data.split()
    village = parts[1]
    if "HH" in village:
        return "NO"
    return "YES\n" + village.replace(".", "B")

if __name__ == "__main__":
    print(solve(sys.stdin.read()))

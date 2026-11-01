# AI-assisted archived practice solution
def solve(data):
    result = 1
    for i in range(2,int(data)+1):
        result *= i
    return str(result)

if __name__ == "__main__":
    import sys
    print(solve(sys.stdin.read()))

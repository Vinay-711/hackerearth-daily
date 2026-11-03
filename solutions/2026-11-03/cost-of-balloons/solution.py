import sys

def minimum_cost(green, purple, first, second):
    return min(green * first + purple * second,
               purple * first + green * second)

def solve(data):
    values = iter(map(int, data.split()))
    answers = []
    for _ in range(next(values)):
        green, purple, n = next(values), next(values), next(values)
        first = second = 0
        for _ in range(n):
            first += next(values)
            second += next(values)
        answers.append(str(minimum_cost(green, purple, first, second)))
    return "\n".join(answers)

if __name__ == "__main__":
    print(solve(sys.stdin.read()))

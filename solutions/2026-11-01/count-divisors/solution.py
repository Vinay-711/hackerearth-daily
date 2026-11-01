import sys


def count_divisors(left, right, divisor):
    return right // divisor - (left - 1) // divisor


if __name__ == "__main__":
    print(count_divisors(*map(int, sys.stdin.read().split())))

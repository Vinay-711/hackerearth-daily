from solution import count_divisors
checks = 0
for left in range(1,31):
    for right in range(left,41):
        for divisor in range(1,45):
            expected = sum(v % divisor == 0 for v in range(left,right+1))
            assert count_divisors(left,right,divisor) == expected
            checks += 1
assert count_divisors(1,1000,1) == 1000
assert count_divisors(1000,1000,1000) == 1
print(f'{checks+2} cases passed')

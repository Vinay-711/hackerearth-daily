import sys

def main():
    input = sys.stdin.read
    data = input().split()
    if not data:
        return
    
    t = int(data[0])
    index = 1
    results = []
    
    for _ in range(t):
        n = int(data[index])
        index += 1
        a = list(map(int, data[index:index+n]))
        index += n
        
        a.sort()
        # The maximum sum of weights is (largest + second largest) - (smallest + second smallest)
        max_sum = (a[-1] + a[-2]) - (a[0] + a[1])
        results.append(str(max_sum))
    
    print('\n'.join(results))

if __name__ == '__main__':
    main()
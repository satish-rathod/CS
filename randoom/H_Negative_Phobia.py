t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    
    prefix_sum = 0
    count = 0
    
    for x in a:
        prefix_sum += x
        if prefix_sum >= 0:
            count += 1
        if prefix_sum < 0:
            prefix_sum = 0
    
    print(count)
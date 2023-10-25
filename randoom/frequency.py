S = input()
map = {}

for ch in set[S]:
    if ch in map:
        map[ch] += 1
    else:
        map[ch] = 1    
    
print(map)           
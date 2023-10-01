
runs = [i for i in range(1,100)]
length = len(runs)

last_term = runs[length-1]
second_last_term = runs[length-2]

sum = 0

for i in range(1,100):
    sum += i
    
print(sum)

total_sum = sum(runs)
print(total_sum)

runs.append(100)
runs.insert(0,0)

new_runs = [i for i in range(101,150)]
runs.extend(new_runs)

#iterating over a list
for i in range(len(runs),0,-1):
    print(runs[i], end=' ')
    
#list slicing

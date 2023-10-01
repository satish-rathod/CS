x = int(input())
y = int(input())

matrix = [[]*y]*x

for i in range(x):
    for j in range(y):
        matrix[i][j]=int(input())
def PLUD_decomposition(matrix):
    num_rows = len(matrix)
    num_cols = len(matrix[0])
    
    P = [[1 if i == j else 0 for j in range(num_rows)] for i in range(num_rows)]
    L = [[0] * num_cols for _ in range(num_rows)] 
    U = [[elem for elem in j] for j in matrix]
    min_dim = min(num_rows, num_cols)

    for i in range(min_dim):
        if U[i][i] == 0:
            found_nonzero_pivot = False
            for j in range(i + 1, num_rows):
                if U[j][i] != 0:
                    U[i], U[j] = U[j], U[i]
                    P[i], P[j] = P[j], P[i]
                    found_nonzero_pivot = True
                    break
            if not found_nonzero_pivot:
                continue

        pivot_element = U[i][i]

        for j in range(i + 1, num_rows):
            multiplier = U[j][i] / pivot_element
            L[j][i] = multiplier 
            for col in range(i, num_cols):
                U[j][col] -= multiplier * U[i][col]
    
    for i in range(num_rows):
        L[i][i] = 1
    
    return P, L,U 
# split_matrix_U(U)

# def split_matrix_U(U):
#     rows = len(U)
#     cols = len(U[0])

#     D = [[0] * rows for _ in range(rows)]
#     for i in range(rows):
#         D[i][i] = 1

#     U_prime = [[0] * cols for _ in range(rows)]

#     for i in range(rows):
#         for j in range(cols):
#             if j >= i:
#                 U_prime[i][j] = U[i][j]
#                 D[i][i] = U[i][i]

#     for i in range(rows):
#         for j in range(cols):
#             if D[i][i] != 0:
#                 U_prime[i][j] /= D[i][i]

#     return D, U_prime

A= [[0, 0, 2], [2, 1, 2], [1, 2, 1]]
P,L,U = PLUD_decomposition(A)

print("P:")
for r in P:
    print(r)

print("\nL:")       
for r in L:
    print(r)
    
print("\nU:")
for r in U:
    print(r)
    


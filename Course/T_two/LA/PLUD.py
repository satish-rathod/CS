def pldu(matrix):
    """matrix: a non-singular matrix
        returns: (P, L, D, U) such that matrix = PLDU
        where
            P is a row permutation matrix,
            L is a unit lower triangular matrix, 
            D is a D matrix, 
            U is an unit upper triangular matrix"""
            
    rows = len(matrix)
    cols = len(matrix[0])
    
    D = [[0 for nums in range(rows)] for nums in range(rows)]
    L = [[1 if i == j else 0 for j in range(rows)] for i in range(rows)]
    P = [[1 if i == j else 0 for j in range(rows)] for i in range(rows)]
    U = [row for row in matrix]

    for i in range(min(rows, cols)):
    
        if U[i][i] == 0:
            max_row = max(range(i, rows), key=lambda k: abs(U[k][i]))
            if U[max_row][i] == 0:
                continue
            U[i], U[max_row] = U[max_row], U[i]
            P[i], P[max_row] = P[max_row], P[i]
            L[i][:i], L[max_row][:i] = L[max_row][:i], L[i][:i]
        for k in range(i+1, rows):
            L[k][i] = U[k][i] / U[i][i]
            for j in range(i, cols):
                U[k][j] -= L[k][i] * U[i][j]

    P = list(map(list, zip(*P)))
    for i in range(rows):
        D[i][i] = U[i][i] if U[i][i] != 0 else 1
        for j in range(cols):
            U[i][j] /= D[i][i]
   
    return P, L, D, U

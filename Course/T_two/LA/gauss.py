def gaussian_elimination_solve(coefficients_matrix, constants_vector):
    rows, cols = len(coefficients_matrix), len(coefficients_matrix[0])

    if rows != cols:
        return None

    augmented_matrix = [row + [bi] for row, bi in zip(coefficients_matrix, constants_vector)]

    for i in range(cols):
        pivot_row = None
        for j in range(i, rows):
            if augmented_matrix[j][i] != 0:
                pivot_row = j
                break
        if pivot_row is None:
            for k in range(i + 1, rows):
                if augmented_matrix[k][i] != 0:
                    return None
            return None
        augmented_matrix[i], augmented_matrix[pivot_row] = augmented_matrix[pivot_row], augmented_matrix[i]
        for j in range(i + 1, rows):
            factor = augmented_matrix[j][i] / augmented_matrix[i][i]
            for k in range(i, cols + 1):
                augmented_matrix[j][k] -= factor * augmented_matrix[i][k]

    solutions = [0] * cols
    for i in range(cols - 1, -1, -1):
        if augmented_matrix[i][i] == 0:
            return None
        solutions[i] = augmented_matrix[i][cols] / augmented_matrix[i][i]
        for j in range(i - 1, -1, -1):
            augmented_matrix[j][cols] -= augmented_matrix[j][i] * solutions[i]

    return solutions


def determinant(matrix):
    rows, cols = len(matrix), len(matrix[0])

    if rows != cols:
        return 0

    if cols == 2:
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]

    det = 0
    for j in range(cols):
        det += (-1) ** j * matrix[0][j] * determinant(minor(matrix, 0, j))

    return det


def minor(matrix, row, col):
    return [row[:col] + row[col + 1:] for row in (matrix[:row] + matrix[row + 1:])]

A=[
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
]

print(determinant(A))


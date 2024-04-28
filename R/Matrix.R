# WRP to create 5x4 matrix. 3x3 matrix with labels & fill the matrix by rows &
# 2x2 matrix with labels & fill the matrix by columns

# Create a 5 x 4 matrix with labels and fill the matrix by rows
matrix1 <- matrix(1:20, nrow = 5, ncol = 4, byrow = TRUE,
                  dimnames = list(c("Row1", "Row2", "Row3", "Row4", "Row5"),
                                  c("Col1", "Col2", "Col3", "Col4")))
# Create a 3 x 3 matrix with labels
matrix2 <- matrix(21:29, nrow = 3, ncol = 3,
                  dimnames = list(c("Row1", "Row2", "Row3"),
                                  c("Col1", "Col2", "Col3")))
# Create a 2 x 2 matrix with labels and fill the matrix by columns
matrix3 <- matrix(30:33, nrow = 2, ncol = 2,
                  dimnames = list(c("Row1", "Row2"),
                                  c("Col1", "Col2")), byrow = FALSE)

# Print matrices
print(matrix1)
print(matrix2)
print(matrix3)

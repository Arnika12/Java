#18) Create a Matrix using R and Perform the operations addition, subtraction,
#multiplication.

matrix1 <- matrix(c(8,9,4,5,4,9))
matrix2 <- matrix(c(2,3,4,5,6,7))

add <- matrix1 + matrix2
substract <- matrix1 - matrix2
multi <- matrix1 * matrix2

cat("Addition of matrix1 & matrix2 is : ",add)
cat("Substraction of matrix1 & matrix2 is : ",substract)
cat("Multiplication of matrix1 & matrix2 is : ",multi)
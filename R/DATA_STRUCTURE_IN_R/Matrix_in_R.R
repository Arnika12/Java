# ** Data Structures in R  ** 
#------------------------------

# -----------------------------------------------------------------------
# **---- MATRIX ----**  (it is two dimensional homogenous data structure)
# -----------------------------------------------------------------------

# for creating matrix, matrix function / method is used
# in case of matrix by default all values will be given in 1 column and no. of rows equal to no. of elements
# if you want matrix with different no. of columns & rows 
# then "nrow" for number of rows & "ncol" for number of columns attributes used 
# in this we can also use "byrow" for storing values by row i.e byrow = T

m1 <- matrix(c(1,2,3,4,5,6))
m1

m2 <- matrix(c('A','B','C','D','E','F') , nrow = 2 , ncol = 3)
m2

m3 <- matrix(c(1.23,2.2,3.8,4.54,54.5,60.0) , nrow = 3 , ncol = 2 , byrow = T )
m3

m4 <- matrix(c(1.23,2.2,3.8,4.54,54.5,60.0) , nrow = 3 , ncol = 2)
m4

#accessing matrix elements
# MATRIX  m1 
m1[1]
m1[2]
m1[3]
m1[4]
m1[5]
m1[6]

# MATRIX  m2
m2[1,1]
m2[1,2]
m2[1,3]
m2[2,1]
m2[2,2]
m2[2,3]

# MATRIX  m3
m3[1,1]
m3[1,2]
m3[2,1]
m3[2,2]
m3[3,1]
m3[3,2]


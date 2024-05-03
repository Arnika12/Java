# ** Data Structures in R  ** 
#------------------------------

# -----------------------------------------------------------------------
# **---- ARRAY ----**  
# -----------------------------------------------------------------------

#DEFn
# it is multi-dimensional homogenous data structure
# array is combination of vectors

v1 <- c(1,2,3,4,5,6)
v2 <- c(7,8,9,10,11,12)

a1 <- array(c(v1 , v2) , dim = c(2 , 3 , 2))
# dim = c(no.of rows , no. of cols , no.of matrices/dimensions)
a1

a2 <- array(c(v1 , v2) , dim = c(2 , 2 , 3))
a2

# extrating elements

# from a1
a1[1,1,1]  #here 1(last) is dimension or matrix no.
a1[1,2,1]
a1[1,3,1]

a1[2,1,1]
a1[2,2,1]
a1[2,3,1]

a1[1,1,2]
a1[1,2,2]
a1[1,3,2]

a1[2,1,2]
a1[2,2,2]
a1[2,3,2]

# from a2
a2[1,1,1]  
a2[1,2,1]
a2[2,1,1]
a2[2,2,1]

a2[1,1,2]
a2[1,2,2]
a2[2,1,2]
a2[2,2,2]

a2[1,1,3]
a2[1,2,3]
a2[2,1,3]
a2[2,2,3]



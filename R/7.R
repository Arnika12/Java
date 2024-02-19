# 7) Write a R program to create a list containing a vector, a matrix and a list & 
# give names to the elements in the list. Access the first & second element of the list.

list1 <- list(c(11,22,33,44,55),
              matrix(c(12,13,14,15,16,17),nrow=2 , byrow=FALSE),
              list("r","java","python","c"))
print(list1)

#accessing elements
print(list1[1])
print(list1[2])


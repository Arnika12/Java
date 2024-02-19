#8) Write a R program to create a list containing a vector, a matrix and a list
# and remove the second element.

list1 <- list(c("A","B","C","D"),
              matrix(c(11,22,33,44)),
              list(1.2,4.5,7.8,34.5))
print(list1)
#list1[-2]
#list1[1] <- NULL
append(list1,c("aaa","bbb","ccc"),after=3)


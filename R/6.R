#6. Write a R program to list containing a vector, a matrix and a list and give
# names to the elements in the list.

list1 <- list(c(11,22,33,44,55),
           matrix(c(12,13,14,15,16,17),nrow=2),
           list("r","java","python","c"))
print(list1)

names(list1) <- c("Numbers","Marks","Subjects")
print(list1)

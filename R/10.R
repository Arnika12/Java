# 10) Write a R program to assign new names "a", "b" and "c" to the elements of
# a given list.

list1 <- list(c(11,22,33,44,55),
              matrix(c(12,13,14,15,16,17),nrow=2),
              list("r","java","python","c"))
print(list1)

names(list1) <- c("a","b","c")
print(list1)

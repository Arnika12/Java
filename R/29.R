# 29) Write an R program to convert a given matrix to a list and print list in ascending order.

m = matrix(1:10, ncol=2)
print("Original matrix:")
print(m)

#convert matrix to list
l = as.list(m)
print(l)

#sort above list
l1 <- sort(unlist(l))
print(l1)

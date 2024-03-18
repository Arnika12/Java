# 29) Write an R program to convert a given matrix to a list and print list in ascending order.

m = matrix(1:10, ncol=2)
print("Original matrix:")
print(m)
l = split(m, rep(1:ncol(m), each = nrow(m)))
# l = split(m, rep(1:nrow(m), each = ncol(m)))
print("list from the said matrix:")
print(l)

# • Matrix m split into a list l based on column-wise grouping.
# • Rep(1:ncol(m), each = nrow(m)) creates a vector assigning each row to a unique group number.
# • Split(m,...) splits m into subsets based on the grouping vector.
# • Each subset contains rows belonging to a specific group.
# • The result is a list l with each element representing a group and its corresponding rows.
# WRP to print minumum & maximum value of sepal length feature in iris dataset.

data(iris$sepal.length)
print(data)

# Calculate minimum and maximum values of Sepal.Length column ignoring missing values
a <- min(data$sepal.length)
b <- max(data$sepal.length)

cat("Minimum value of sepal length feature in iris dataset is : ", a)
cat("Maxmum value of sepal length feature in iris dataset is : ", b)

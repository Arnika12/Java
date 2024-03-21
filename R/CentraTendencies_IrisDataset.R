# WRP to print central tendencies of all the features of iris dataset

data(iris)
print(data)

cat("The Mean is:",mean(data$sepal.length))
cat("The Median is:",median(data$sepal.length))
modev <- names(which.max(table(data$sepal.length)))            
cat("The Mode is:",modev)

cat("The Mean is:",mean(data$sepal.width))
cat("The Median is:",median(data$sepal.width))
modev <- names(which.max(table(data$sepal.width)))            
cat("The Mode is:",modev)

cat("The Mean is:",mean(data$petal.length))
cat("The Median is:",median(data$petal.length))
modev <- names(which.max(table(data$petal.length)))            
cat("The Mode is:",modev)

cat("The Mean is:",mean(data$petal.width))
cat("The Median is:",median(data$petal.width))
modev <- names(which.max(table(data$petal.width)))            
cat("The Mode is:",modev)
		

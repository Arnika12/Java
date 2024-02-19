#20) Using R import the data from Excel/.CSV file and find standard deviation,
#variance and co-variance.

data <- read.csv("D:\\MSc FY\\R\\R\\19data1.csv") 
print(data)
cat("The Mean is:" ,mean(data$Salary))
cat("The Standard Deviation is:",sd(data$Salary))
cat("The Variance is:",var(data$Salary))

covariance <- (sd(data$Salary)/mean(data$Salary))*100
cat("The Co-Variance is:",covariance)
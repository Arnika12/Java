#19) Using R import the data from Excel/.CSV file and find mean, median,
#mode, quartiles.

list.files("D:/MSc FY/R/R/")    #to list all present files in particular folder

data <- read.csv("D:\\MSc FY\\R\\R\\19data1.csv")   #read/import data
print(data)
cat("The Mean is:",mean(data$Salary))
cat("The Median is:",median(data$Salary))
cat("The Quantile is:",quantile(data$Salary,probs = c(0.25,0.5,0.75)))

modev <- names(which.max(table(data$Salary)))
cat("The Mode is:",modev)

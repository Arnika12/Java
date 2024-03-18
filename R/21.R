#21) Write a R program to count the number of NA values in a data frame column.

data <- read.csv("D:\\MSc FY\\Programming\\R\\airquality.csv")
print(data)
count <- sum(is.na(data$Ozone))
count1 <- sum(is.na(data$Solar.R))
count2<- sum(is.na(data$Wind))
count3<- sum(is.na(data$Temp))
count4<- sum(is.na(data$Month))

print(paste("Number of NA values in column Ozone :", count))
print(paste("Number of NA values in column Solar:", count1))
print(paste("Number of NA values in column Wind :", count2))
print(paste("Number of NA values in column Temp :", count3))
print(paste("Number of NA values in column Month :", count4))

count6 <-  sum(is.na(head(data,10)))
print(count6)
tail(data)

#22) Write a R program to call the (built-in) dataset air quality. 
#    Remove the variables 'Solar.R' and 'Wind' and display the data frame.

data <- read.csv("D:\\MSc FY\\Programming\\R\\airquality.csv")
print(data)

#data[3]<- NULL
#print(data)
#data[3]<- NULL
#print(data)

data[,c("Solar.R")]=NULL
print(data)

data[,c("Wind")]=NULL
print(data)

print("After removing Solar.R and Wind from dataframe ")
print(data)

#24) Write a R program to create a factor corresponding to height of women
#    data set, which contains height and weights for a sample of women.

data <- read.csv("weight-height.csv")
print(data)

a = cut(data$Height,3)
print(a)

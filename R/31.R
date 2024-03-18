# 31) Consider the inbuilt iris dataset 
#      i) Create a variable “y” and attach to it the output attribute of the “iris” dataset .
#     ii) Create a barplot to breakdown your output attribute. 
#     iii) Create a density plot matrix for each attribute by class value.

data <- read.csv("D:\\MSc FY\\Programming\\R\\iris.csv")
print(data)

# i) 
y <- data$variety

# ii) 
barplot(x, names.arg=y, col="red", main="Breakdown of Output Attribute", xlab="Species", ylab="Count",density=50,space=20)

# iii) 
library(ggplot2)
ggplot(data, aes(x=Sepal.Width)) + geom_density(aes(fill=Species), alpha=0.5) +
  labs(title="Density Plot of Sepal Width by Species") +
  theme_minimal()

ggplot(data, aes(x=Sepal.Length)) + geom_density(aes(fill=Species), alpha=0.5) +
  labs(title="Density Plot of Sepal Length by Species") +
  theme_minimal()

ggplot(data, aes(x=Petal.Width)) + geom_density(aes(fill=Species), alpha=0.5) +
  labs(title="Density Plot of Petal Width by Species") +
  theme_minimal()

ggplot(data, aes(x=Petal.Length)) + geom_density(aes(fill=Species), alpha=0.5) +
  labs(title="Density Plot of Petal Length by Species") +
  theme_minimal()

d.density(x)
plot(d.frame=FALSE, col="skyblue")

# incomplete
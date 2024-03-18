#24) Write a R program to create a factor corresponding to height of women
#    data set, which contains height and weights for a sample of women.

data <- read.csv("D:\\MSc FY\\Programming\\R\\weight-height.csv")

# Filter the dataset to include only women's data
women_data <- subset(data, Gender == "Female")

# Create a factor corresponding to height
height_factor <- cut(women_data$Height, breaks = 3, labels = c("Short", "Medium", "Tall"))

# Print the factor
print(height_factor)

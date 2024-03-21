# 31) Consider the inbuilt iris dataset 
#      i) Create a variable “y” and attach to it the output attribute of the “iris” dataset .
#     ii) Create a barplot to breakdown your output attribute. 
#     iii) Create a density plot matrix for each attribute by class value.


# Load the Iris dataset
data(iris)

# i) Create a variable “y” and attach to it the output attribute of the “iris” dataset
y <- iris$Species

# ii) Create a barplot to breakdown your output attribute
barplot(table(y), col = "red", main = "Breakdown of Output Attribute", 
        xlab = "Species", ylab = "Count")

# iii) Create a density plot matrix for each attribute by class value
library(ggplot2)
ggplot(iris, aes(x = Sepal.Length, fill = Species)) +
  geom_density(alpha = 0.5) +
  labs(title = "Density Plot of Sepal Length by Species")

ggplot(iris, aes(x = Sepal.Width, fill = Species)) +
  geom_density(alpha = 0.5) +
  labs(title = "Density Plot of Sepal Width by Species")

ggplot(iris, aes(x = Petal.Length, fill = Species)) +
  geom_density(alpha = 0.5) +
  labs(title = "Density Plot of Petal Length by Species")

ggplot(iris, aes(x = Petal.Width, fill = Species)) +
  geom_density(alpha = 0.5) +
  labs(title = "Density Plot of Petal Width by Species")


#In part iii) of the question, we're instructed to create a density plot matrix for each attribute by class value using the Iris dataset. Let me break down the steps:

#1. Load the Required Library**: We need the `ggplot2` library to create density plots in R. It's a powerful and popular package for data visualization.

#2. Create Density Plots: For each attribute (Sepal Length, Sepal Width, Petal Length, Petal Width), we're going to create a density plot showing the distribution of that attribute's values across the different species of iris flowers. This means we'll have four density plots, one for each attribute.

#3. ggplot2 Syntax: We use the `ggplot()` function to initialize the plot. Inside `aes()`, we specify the x-axis variable (`x`) and the fill color (`fill`) based on the species.

#4. geom_density(): This function adds a density plot to the plot. We set `alpha = 0.5` to make the density plots semi-transparent.

#5. labs(): We use this function to set the title of each plot.

#6. Repeat for Each Attribute: We repeat these steps for each attribute, changing the x-axis variable accordingly.

#The result will be four density plots, each showing the distribution of one of the four attributes (Sepal Length, Sepal Width, Petal Length, Petal Width) across the three species of iris flowers (Setosa, Versicolor, Virginica). This helps us visualize how each attribute varies among different species of iris.
#    in this above provided text remove all * and also add # before each line

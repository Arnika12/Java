# -----------------------------------------------------------------------
# **---- IN-BUILT  FUNCTIONS  ----**  
# -----------------------------------------------------------------------
# we are using one inbuilt data frame here

View(iris)  # for viweing any data frame iris-name of data frame
str(iris)   # give structure (like no. of column ,no. of records , name & type of coulmns) of dataframe 

head(iris)    #give 1st 6 records of iris
head(iris,n)  # give 1st n records of iris

tail(iris)    #give last 6 records of iris
tail(iris,n)  # give last n records of iris

table(iris$Species)  # used on categorical values

#some arithematic operations
min(iris$Sepal.Length)
max(iris$Sepal.Length)
mean(iris$Sepal.Length)
range(iris$Sepal.Length)

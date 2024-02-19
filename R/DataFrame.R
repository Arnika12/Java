# 11) create a empty data frame using data.frame()

emp.data <- data.frame()
print(emp.data)

#------------------------------------------------------------
#create a empty data frame with 0 rows and 0 columns
matrix.data <- data.frame(matrix(nrow = 0, ncol = 0))
print(matrix.data)

#------------------------------------------------------------
#create an empty data frame with 0 rows & columns with names 
name <- c("rollno","name","age")
matrix.data1 <- data.frame(matrix(nrow=0,ncol=length(name)))  # ncol=3 also correct
colnames(matrix.data1)=name
print(matrix.data1)

#------------------------------------------------------------
#create an empty data frame with rows with names and columns with names 
cname <- c("rollno","name","age")
rname <- c(1:5)
matrix.data1 <- data.frame(matrix(nrow=length(rname),ncol=length(cname)))  # ncol=3 also correct
colnames(matrix.data1)=cname
rownames(matrix.data1)=rname
print(matrix.data1)



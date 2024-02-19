#14) Write a R program to save the information of a data frame in a file and
# display the information of the file.

std.rollno <- c(1:10)
std.name <- c("ram","priya","shreya","pradnya","sayali","RAJ","Rucha","Rani","Harshali","Payal")
std.subject <- c("C","JAVA","PYTHON","C#","R","C","JAVA","PYTHON","C#","R")
std.marks <- c(90,89,90,95,96,98,90,89,97,98)

std.data <- data.frame(std.rollno,std.name,std.subject,std.marks)
print(std.data)

write.csv(std.data, file = "student.csv")

read_data <- read.csv("student.csv")
print("Data Frame from File:")
print(read_data)
file.info("student.csv")
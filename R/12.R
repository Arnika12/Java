#12) Write a R program to create a data frame from four given vectors.

std.id <- c(1:10)
std.name <- c("ram","priya","shreya","pradnya","sayali","RAJ","Rucha","Rani","Harshali","Payal")
std.course <- c("FYMSCCA","SYMSCCA","FYBCA","TYBCA","FYMSCCA","SYMSCCA","FYBCA","TYBCA","FYMSCCA","FYMSCCA")
std.marks <- c(90,89,90,95,96,98,90,89,97,98)

#print individual vector
print(std.id)
print(std.name)
print(std.course)
print(std.marks)

#creating data frame
std.data <- data.frame(std.id,std.name,std.course,std.marks)
print(std.data)

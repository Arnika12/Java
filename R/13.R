#13) Write a R program to create a data frame using two given vectors and
# display the duplicated elements and unique rows of the said data frame.

std.name <- c("Rucha","priya","shreya","Payal","priya","RAJ","Rucha","shreya","Harshali","Payal")
std.marks <- c(90,89,90,95,89,98,90,89,97,95)

std.data <- data.frame(std.name,std.course,std.marks)
print(std.data)

#check duplicate rows
dupli <- duplicated(std.data)
print(dupli)

#check unique rows
uniq.data <- unique(std.data)
print(uniq.data)

#giving name to columns
cname <- c("Student Name","Course")
colnames(std.data) <- cname
print(std.data)

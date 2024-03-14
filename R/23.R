#23) Write a R program to compare two data frames to find the row(s) in firstdata 
#    frame that are not present in second data frame

# first=data.frame(A=c(9,8,7),B=c(8,8,8),C=c(9,9,2))
# second=data.frame(A=c(8,8,8),B=c(5,8,9))
# print(setdiff(first,second))

stud.data<-data.frame(stud.id=c(101:105),
                      stud.name=c("ABC","LMN","PQR","XYZ","STU"),
                      stud.marks=c(80,92,77,83,89),
                      stud.subject=c("Pyhon","DS","WT","OS","JAVA"))
print(stud.data)

emp.data<-data.frame(emp.id=c(101:105),
                     emp.name=c("ABC","LMN","PQR","XYZ","STU"),
                     emp.salary=c(25000,30000,32000,22000,20000),
                     stud.marks=c(88,90,77,63,89),
                     desg=c("Manager","Staff","Clerk","HR","Staff"))

print(emp.data)

print(setdiff(stud.data,emp.data))
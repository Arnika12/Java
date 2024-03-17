#Write a R program to create a simple bar plot of five subjects marks.

marks <- c(30,50,40,80,35)
subject <- c("python" ,"java","R","HTML","PHP")

print(marks)     #print display o/p with helps of indexing([1])
print(subject)

print(marks,subject)  #gets error as print not allow multiple variable

cat(marks)
cat(marks,subject)  #takes multiple argument 

num <-(1:50)
print(num)   # assign index to each num
cat(num)     # not assign index to each num

barplot(marks,names.arg=subject,main="Graph for 5 subject mark",xlab = "subject",
        ylab= "marks",col="red",density=55,border="blue")


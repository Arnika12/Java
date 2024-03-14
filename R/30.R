# 30) Write an R program to create a Data frames which contain details of
#     5 employees and display the details in ascending order.

Emp = data.frame(Name=c("Payal","Yogita","Raj","Snehal", "Sakshi"),
                       Gender=c("F","M","F","F","F"),
                       Age=c(23,22,25,26,32),
                       Designation=c("Clerk","Manager","Exective","CEO","ASSISTANT"))
print("Details of the employees:")                      
print(Emp)

print("sort the data in ascending order based on Names ")
print(Emp[order(Emp$Name,decreasing = FALSE),])

# print("sort the data in decreasing order based on Names ")
# print(Emp[order(Emp$Name, decreasing = TRUE), ]   )




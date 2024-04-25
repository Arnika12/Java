#9) Write a R program to merge two given lists into one list.

list1 <- list(11,22,33,44,55)
list2 <- list(10,20,30,40,50)

print(list1)
print(list2)

#merge lists
merged.list <- list(c(list1,list2))     # c() used to merge 2 lists
print(merged.list)


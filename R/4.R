#4. Write a R program to get the unique elements of a given string and unique numbers of vector

str <- "programming"
char <- unlist(strsplit(str, ""))
print(char)
uniChar <- unique(char)
print(uniChar)

b <- c(10,29,3,3,54,55,10)
print(b)
uniqb <- unique(b)
print(uniqb)


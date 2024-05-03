# ** Data Structures in R  ** 
#------------------------------

# -----------------------------------------------------------------------
# **---- LIST ----**  (it is single dimensional heterogenous data frame
# -----------------------------------------------------------------------

# for creating list, list method is used

l1 <- list(1,2L,'a',T)
print(l1)
cat('The given list is : ' , l1 , '\n') #Error in cat("The given list is : ", l1, "\n") : 
# argument 2 (type 'list') cannot be handled by 'cat'

#printing class of each element of given list 
cat('class of 1st ele if l1 is ' , class(l1[[1]]) , '\n')
cat('class of 2nd ele if l1 is ' , class(l1[[2]]) , '\n')
cat('class of 3rd ele if l1 is ' , class(l1[[3]]) , '\n')
cat('class of 4th ele if l1 is ' , class(l1[[4]]) , '\n')

#extracting element of list
l1[[1]]
l1[[2]]
l1[[3]]
l1[[4]]

# LIST OF VECTORS 
l2 <- list(c(1.1,2L,3) , c('A' , 'B' , 'C') , c(12.23 , 45.4 , 56.8))
l2

#printing class of each element of given list 
cat('Class of 3rd element of vector 1 of l2 is ', class(l2[[1]][1]), '\n')
cat('Class of 3rd element of vector 1 of l2 is ', class(l2[[1]][2]), '\n')
cat('Class of 3rd element of vector 1 of l2 is ', class(l2[[1]][3]), '\n')
cat('Class of 3rd element of vector 2 of l2 is ', class(l2[[2]][3]), '\n')
cat('Class of 1st element of vector 3 of l2 is ', class(l2[[3]][1]), '\n')
cat('Class of 2nd element of vector 2 of l2 is ', class(l2[[2]][2]), '\n')

#extracting element of list
l2[[1]][1]
l2[[2]][2]
l2[[3]][2]
l2[[2]][3]


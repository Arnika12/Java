# ** Data Structures in R  ** 
#------------------------------

# -----------------------------------------------------------------------
# **---- DATA FRAME  ----**  
# -----------------------------------------------------------------------

#DEFn
# it is two dimensional heterogenous data structure
# data.frame method used to create data frame

data.frame(fruit_name=c("apple","guava","cherry") , fruit_cost=c(10,20,30)) -> fruits
fruits

#extracting individual column from data frame
fruits$fruit_cost
fruits$fruit_name

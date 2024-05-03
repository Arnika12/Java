# -----------------------------------------------------------------------
# **---- DATA VISUALIZATION ----**  
# -----------------------------------------------------------------------


#loading package ggplot2  it provides diamond dataset
install.packages("ggplot2")
library("ggplot2")
View("diamonds")
??diamonds  #giving info of data frame i.e diamond

#ggplot2 based on grammer of graphics  i.e there are different layer of data 
#histogram
ggplot(data= diamonds, aes(x=price)) + geom_histogram()

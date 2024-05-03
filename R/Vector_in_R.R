# ** Data Structures in R  ** 
#------------------------------

# -----------------------------------------------------------------------
# **--- VECTOR ---** : (it is single dimensional homogenous data frame)
# -----------------------------------------------------------------------

v <- c(1,2,3)  # c means combine
cat('Vector v is ' , v , '\n')
cat('class of Vector v is ' , class(v) , '\n')

v1 <- c('A' , 'B' , 'C')
cat('Vector v1 is ' , v1 , '\n')
cat('class of Vector v1 is ' , class(v1) , '\n')

v2 <- c(12.23 , 45.4 , 56.8)
cat('Vector v2 is ' , v2 , '\n')
cat('class of Vector v2 is ' , class(v2) , '\n')

v3 <- c(12L, 3L , 45L , 4L , 56L ,8L)
cat('Vector v3 is ' , v3 , '\n')
cat('class of Vector v3 is ' , class(v3) , '\n')

# extracting elements of vector 
v[3]
v1[1]
v1[3]
v2[1:3]


# in this case since vector is a homogenous data structure 
# agar hum yahape different types ke element print krenge 
# to yaphape sirf jo different types ke element hai wo jis 
# jis bhi element ki higher priority hai us higher priority 
# wale element mai wo corse(convert) ho jayege 

mixbag <- c(1,2,3,T)
print (mixbag)
# in this case mixbag will give result as {1 2 3 1}
# because in case of numeric & logical data type 
# element numeric has higher priority

mixbag1 <- c(1,2,'s',3,'r')
print (mixbag1)
# in this case mixbag1 will give result as {"1" "2" "s" "3" "r"}
# because in case of numeric & character data type 
# character has higher priority 


mixbag2 <- c(1,2,3,T , 34.5 , F , 't')
print (mixbag2)
# in this case mixbag2 will give result as {"1" "2" "3" "TRUE" "34.5" "FALSE" "t"}
# because in case of numeric , float & character data type 
# character has higher priority 


# extracting elements of vector 
mixbag[4]
mixbag[1:4]
mixbag1[1:5]
mixbag2[1:3]
mixbag2[2:3]



# -----------------------------------------------------------------------
# **---- Decision Making Statements  ----**  
# -----------------------------------------------------------------------

# if   if...else

# if
if(iris$Sepal.Length[1] > 4 )   #[1] :- cell no 1
{
  print("sepal length greater than 4")
}

if(iris$Sepal.Length[1] < 4 )   #[1] :- cell no 1
{
  print("sepal length greater than 4")
}

# if...else
if(iris$Sepal.Length[1] < 4 ){   #[1] :- cell no 1
  print("sepal length less than 4")
}else{    #else should be written in same line
  print("sepal length greater than 4")
}

#2. Write a Python program to create a list of tuples with the first element as the 
#number and second element as the square of the number

t1=(1,2,3,4,5,6,7,8,9)
sq=[(val,(val**2))for val in t1]
print("Given tuple is ",t1)
print("Square of above tuple : ","\n",sq)
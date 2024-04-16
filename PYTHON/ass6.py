"""ASSIGNMENT NO.6:-PYTHON FUNCTIONS
1. Write a python function to sum of all the elements in a list"""

"""d=[12,342,23,4,345,546790,546]
sum=sum(d)
print(sum)


d=[12,342,23,4,345,546790,546]
sum=0
for i in d:
	sum=sum+i
	print(sum)"""


"""li=[]
n=int(input("Enter No. of Elements for list :\n"))
for i in range(n):
	li.append(int(input("Enter element : ")))
print("Given list is :  ",li)
def listsum(li):
 total=0
 i=0
 while i < len(li):
  total=total+li[i]
  i=i+1
 return total
totalsum=listsum(li);
print("Sum of given list of numbers is:",totalsum)"""

"""2. Write a python function to calculate the factorial of a number.
the function accept the number as an argument."""

#using given list
"""def fact(n):
	f=1
	for i in range(1,n+1):
		f=f*i
	return f
li=[2,3,4,5,6,7,8,7]
res=map(fact
,li)
print(list(res))"""

#using input function
"""def fact(n):
	f=1
	for i in range(1,n+1):
		f=f*i
	return f
li=[]
n=int(input("Enter No. of Elements for list :\n"))
for i in range(n):
	li.append(int(input("Enter element : ")))
print("Given list is :  ",li)
res=map(fact,li)
b=list(res)
print("Factorial of given elements of list is : ",b)"""

"""3. Write a python function to check whether a number falls 
within a given range.
num=0
def check_range(num):
	fr=int(input("Enter start range"))
	lr=int(input("Enter last range"))
	print("Enter a number betn range of",fr,"to",lr)
	num +=int(input("Enter a number : "))	
	if num in range(fr,lr):
		print(num," is in the given range")
	else:
		print(num," is not in the given range")	
check_range(num)"""

"""4. Write a python function that takes a list and returns a new 
list with distict elements from the first list
Sample list:[1, 2 , 2, 3, 3, 3, 3, 4, 5]
Unique list:[1, 2, 3, 4, 5]

li=[1,2,3,4,3,4,3,2,3,4,5,6,45,6,6]
def unique_element(num)
unique_list=[]
for a in li:
	if n not in num:
		unique_list.append(a)
print(unique_list)"""

#l=[1,2,3,3,3,3,4,5]
def unique_list(l):
  x = []
  for a in l:
    if a not in x:
      x.append(a)
  return x
unique_list(l)#

def unique_list(numbers):
    unique = []
    for item in numbers :
        if item in unique == False:
            unique.append(item)
    return unique


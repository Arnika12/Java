#special fn in python
# reduce()

from functools import reduce
def fun(a,b):
	return(a+b)
li=[1,2,3,4,5,6,7,8,9]
res=reduce(fun,li)
print(res)

#filter()

import functools
def prime(n):
	for i in range (2,n//2+1):
		if(n%2==0):
			return(False)
	return(True)
li=[1,2,3,5,6,8,9,90]
value=filter(prime,li)
print("Given list is : ",li)
print("Prime number in given list are : ")
print(list(value))

#map()

def fact(n):
	f=1
	for i in range (1,n+1):
		f=f*i
	return f
li=[1,2,3,4,5]
res=map(fact,li)
print(list(res))
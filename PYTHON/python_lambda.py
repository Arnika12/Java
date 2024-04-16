#PYTHON LAMBDA

#lamda with filter
fruits = ['mango', 'apple', 'orange', 'cherry', 'grapes']
print(list(filter(lambda fruit: 'g' in fruit, fruits)))

#lambda with reduce
from functools import reduce
lst = [2,4,6,8,10]
print(reduce(lambda x, y: x+y, lst))


lst = [2,4,6,8]
#find largest element
print(reduce(lambda x, y: x if x>y else y, lst))
#find smallest element
print(reduce(lambda x, y: x if x<y else y, lst))

#lambda with map
tup= (5, 7, 22, 97, 54, 62, 77, 23, 73, 61)
newtuple = tuple(map(lambda x: x+3 , tup)) 
print(newtuple)
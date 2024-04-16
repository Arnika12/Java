#Slicing of array 

import array as arr
a=arr.array("i",[1,2,3,4,5,7,8])
print("Array is :",a)
"""for i in a:
	print(i,end=" ")
print("\n")"""

#slicing
print(a[ : ])
print(a[ :3])
print(a[-2:])
print(a[0:3])
print(a[0:-3])




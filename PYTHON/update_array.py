#updating element of array

import array as arr
a=arr.array("i",[1,2,3,4,5,7,8])
print("Array before updation is :")
for i in a:
	print(i,end=" ")
print("\n")

#update array
a[4]=400
a[6]=500
print("Array after updation is :")
for i in a:
	print(i,end=" ")
print("\n")
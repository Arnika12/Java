"""pos=-1
def linear_search(list,n):
	i=0
	while(i<len(list)):
		if(list[i]==n):
			globals() ['pos']=i
			return True
		i=i+1
	return False

list=[90,56,34,2,768,4,86,2]
print("Given list is : ",list)
n=int(input("Enter a element to search"))
if(linear_search(list,n)):
	print("Element is found in list at index : ",pos)
else:
	print("Element not found")"""




f=0
def binary_search(list):
	n=int(input("Enter a number to search : "))
	low=0
	high=len(list)-1
	
	while(low<=high):
		mid=(low+high)//2
		if(list[mid]==n):
			print("Element is found")
			global f
			f=1
			break
		elif(n<list[mid]):
			high=mid-1
		else:
			low=mid+1
	if f==0:
       		 print("Element not found")

list=[45,56,78,232,1,2,7]
print("Given list is : ",list)
list.sort()
print("Sorted list is : ",list)
binary_search(list)




"""def bubble_sort(arr):
	n=len(arr)
	for i in range (n):
		flag=True
		for j in range(0,n-i-1):
			if(arr[j]>arr[j+1]):
				arr[j],arr[j+1]=arr[j+1],arr[j]
				flag=False
		if flag:
			break
	return arr

arr=[45,67,89,3,56,13]
print("Given array: ",arr)
sort=bubble_sort(arr)
print("Sorted array :",arr)"""




"""def insertion_sort(arr):
    for i in range(1,len(arr)):
        key=arr[i]
        j=i-1
        while(j>=0 and arr[j]>key):
            arr[j+1]=arr[j]
            j-=1
        arr[j+1]=key
    return arr
    
arr=[1,56,89,34,9,2]
print("Given array :" ,arr)
sort=insertion_sort(arr)
print(" Sorted array : ",arr)"""



		
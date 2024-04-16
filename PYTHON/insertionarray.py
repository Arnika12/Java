def insertion_sort(array):
	for i in range(1,len(array)):
		key_item=array[i]
		j=i-1
	while j>=0 and array[j]>key_item:
		array[j+1]=array[j]
		j-=1
	array[j+1]=key_item
	return array

array=[11,22,33,44,77,88,99,55]
print("Original array : ",array)
print("Insertion sort array : ",insertion_sort(array))
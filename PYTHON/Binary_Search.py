f = 0

def BinarySearch(list):
    n = int(input("Enter a number to search: "))
    low = 0
    high = len(list) - 1
    
    while low <= high:
        mid = (low + high) // 2  
        if list[mid] == n:
            print("Element found")
            global f  
            f = 1
            break  
        elif n < list[mid]:
            high = mid - 1
        else:
            low = mid + 1
                                                                                                            
    if f == 0:
        print("Element is not found")

list = [11, 22, 33, 44, 55, 66, 77, 88]  
print("Given list is:", list)
list.sort()
BinarySearch(list)                                                 


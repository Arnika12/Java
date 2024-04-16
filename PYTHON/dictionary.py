dict11={'A':1,'B':2,'C':3,'D':4,'E':5}
print("Given dictionary elements are : ")
for i in dict11:
	print(i,"---->",dict11[i])

Dict = {}
print("Empty Dictionary: ")
print(Dict)
 
Dict = dict({1: 'Geeks', 2: 'For', 3: 'Geeks'})
print("\nDictionary with the use of dict(): ")
print(Dict)
 
Dict = dict([(1, 'Geeks'), (2, 'For')])
print("\nDictionary with each item as a pair: ")
print(Dict)


#set
# create a set of mixed data types
s1 = {'Hello', 101, -2, 'Bye'}
print("Given set is :",s1)
s1.add(444)
print("Set : ",s1)

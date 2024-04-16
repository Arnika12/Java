#Python Operators

print("Arithmatic Operator")
a=23
b=53
c=56
print("Addition is : ",a+b)

print("Assignment Operator")
a +=b
print(a)

print("Bitwise Operator")
print(a&b)

print("Comparison Operator")
if(a>b):
	print(a)
else:
	print(b)

print("Logical Operator")
if(a>b & a>c):
	print(a)
elif(b>c & b>a):
	print(b)
else:
	print(c)

print("Identity Operator")
x="India"
print(x is "India")
print(x is "Delhi")
print(x is not "India")

print("Membership Operator")
str="Python is coding language"
print("Python" in str)
print("Python" not in str)
print("java" in str)
print("is" in str)
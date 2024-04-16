a=int(input("Enter the lower range:"))
b=int(input("Enter the upper range:"))
c=[(x,x**2)for x in range(a,b)]
print(c)
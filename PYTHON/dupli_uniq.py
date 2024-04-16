#2) Write a program which accepts 6 integer values and prints “DUPLICATES” 
#if any of the values entered are duplicates otherwise it prints “ALL UNIQUE”. 
#Example: Let 5 integers are (32, 10, 45, 90, 45, 6) then output “DUPLICATES” to be printed.

print('Enter 6 numbers..')
a=list()
for i in range(6):
   a.append(int(input('Enter: ')))
if len(set(a))!=len(a):
   print('DUPLICATES.')
else:
   print('Unique.')
"""ASSIGNMENT NO.4:- PYTHON DICTIONARY
1. Write a Python program to combine two dictionary adding values for common keys.
Sample Dictionary:
d1={'a':100,'b':200,'c':300}
d2={'a':300,'b':200,'d':400}
Sample output: Counter({'a': 400, 'b': 400, 'd': 400, 'c': 300})

from collections import Counter
d1={'a':100,'b':200,'c':300}
d2={'a':300,'b':200,'d':400}
ccount=Counter(d1)+Counter(d2)
print(ccount)

2. Write a Python script to generate and print a dictionary that contains a number (Between
1 and n) in the form (x, x*x).
Sample Dictionary (n = 5)
Expected Output : {1: 1, 2: 4, 3: 9, 4: 16, 5: 25}"""

n=int(input("Input a number "))
d = dict()
for x in range(1,n+1):
    d[x]=x*x
print(d) 


"""3. Write a Python program to create a dictionary from a string.
Sample-String:’W3resource’
Expected output: {'3': 1, 's': 1, 'r': 2, 'u': 1, 'w': 1, 'c': 1, 'e': 2, 'o': 1}

from collections import defaultdict, Counter
str= 'W3resource' 
d1= {}
for letter in str:
    d1[letter] = d1.get(letter,0) + 1
print(d1)"""


"""3) Write a program to display following pattern.
1
2 3
4 5 6
7 8 9 10"""

number = 1
for i in range(0, 4):
    for j in range(0, i + 1):
        print(number, end=" ")
        number=number+1
    print(" ")
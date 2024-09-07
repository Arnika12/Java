''' Write a function to get a comma-separated list of names as input from the user, capitalize the first letter of 
each name, and print each name in the list on a new line.

Input:
A string names_str containing comma-separated names provided by the user. Each name may contain alphabets, spaces, and 
special characters.

Output:
Print each name with the first letter capitalized on a new line.

Sample Input:
john, doe, alice, bob

Sample Output:
John
Doe
Alice
Bob '''
# ------------------------------------------------------------------------------------------------------------
# CODE 
def capitalize_name():
 input_str = input()
  
 l1 = [str1.strip() for str1 in input_str.split(',')]
   
 for x in l1:
  print(x.capitalize())
   
capitalize_name()

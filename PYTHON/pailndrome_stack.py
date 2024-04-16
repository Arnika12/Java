"""Applications of Stack - 1. Implementation of an algorithm that reverses string of characters using stack and checks whether a string is a palindrome"""

class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        else:
            return None

    def is_empty(self):
        return len(self.items) == 0

def is_palindrome(string):
    # Create a stack to store the characters
    stack = Stack()

    # Push each character of the string onto the stack
    for char in string:
        stack.push(char)

    # Initialize an empty string to store the reversed string
    reversed_string = ""

    # Pop each character from the stack and append it to the reversed_string
    while not stack.is_empty():
        reversed_string += stack.pop()

# Check if the reversed string is the same as the original string
    return string == reversed_string

# Test the function
input_string =(input("Enter a word to check it is pailndrome or not : "))
if is_palindrome(input_string):
    print(input_string + " is a palindrome.")
else:
    print(input_string + " is not a palindrome.")



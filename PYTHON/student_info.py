''' You are given a JSON string representing information about students. Each student object has the following 
attributes: "name", "age", and "grade". Write a function to parse the JSON string and print the name, age, and grade of each student.

Input:
A string json_str representing a JSON object containing information about students. The JSON string may contain 
multiple student objects.

Output:
Print the name, age, and grade of each student on separate lines.'''

# -------------------------------------------------------------------
# CODE

import json 

def print_student_info(json_str):
 data = json.loads(json_str)
    
 for student in data['students']:
  print(f"Name : {student['name']}")
  print(f"Age : {student['age']}")
  print(f"Grade : {student['grade']}")
  print()
    
json_str = '{"students": [{"name": "John", "age": 20, "grade": "A"}, {"name": "Alice", "age": 18, "grade": "B"}]}'

print_student_info(json_str)

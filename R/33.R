# 33) Write a script in R to create a list of students and perform the following
#     i) Give names to the students in the list. 
#     ii) Add a student at the end of the list.
#     iii) Remove the first Student.
#     iv) Update the second last student.

students_list <- list("Aditi", "Aarav", "Rucha", "Neha")

# i)
names(students_list) <- c("Student1", "Student2", "Student3", "Student4")
print(students_list)

# ii)
students_list <- c(students_list, "Kavya")
print(students_list)

# iii)
students_list <- students_list[-1]     # -1 number of student to remove from list
print(students_list)

# iv)
students_list[length(students_list) - 1] <- "Rohan"
print(students_list)

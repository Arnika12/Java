class Student:
    clg="xyz"
    def __init__(self,rno,name):
        self.no=rno
        self.name=name

    def display(self):
        print("Student name=",self.name)
        print("Student rollno=",self.no)
        print("College=",Student.clg)
        
student1=Student(1,"Rucha")
student1.display()

student2=Student(2,"A")
student2.display()
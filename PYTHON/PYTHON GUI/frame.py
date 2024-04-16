# frame in Python GUI it is basically same as dic tag in html

from tkinter import *

root = Tk()
root.geometry("655x333")

f1 = Frame(root, bg="blue", borderwidth=5, relief=SUNKEN)
# f1.pack(side=LEFT, fill="y",padx=100)     this line will add padding along x-axis
# f1.pack(side=LEFT, fill="y",pady=100)     this line will add padding along y-axis
f1.pack(side=LEFT, fill="y")

f2 = Frame(root, bg="grey", borderwidth=5)
f2.pack(side=TOP, fill="x")  

l = Label(f1, text="Project Tkinter - Pycharm", font="Verdana 30 bold")
l.pack(pady=160)

l = Label(f2, text="Welcome to sublime text", font="Verdana 30 bold", fg="red" , pady=22)
l.pack()

root.mainloop()

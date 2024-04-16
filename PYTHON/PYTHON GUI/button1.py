from tkinter import *

root = Tk()
root.geometry("600x300")
root.minsize(200,100)
root.title("Exploring button with various functionality")

f1 = Frame(root , borderwidth=1 , bg="grey" , relief=SUNKEN)
f1.pack(side="LEFT")

l1 = Label(f1, text="Get Name", bg="cyan" , fg="cyan" , relief=SUNKEN)
l1.pack(side=LEFT)

root.mainloop()
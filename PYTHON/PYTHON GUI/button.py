from tkinter import *

root = Tk()
root.geometry("655x333")
root.title("Creating Buttons Using Frames")

frame = Frame(root, borderwidth=6, bg="grey", relief=SUNKEN)
frame.pack(side="LEFT", anchor="nw")

def display():
    print("Using Function here in PYTHON GUI")

# b1 = Button(frame, fg="red", text="Print now", borderwidth=0, padx=20,pady=20)
b1 = Button(frame, fg="red", text="Print now")
b1.pack(side=LEFT, padx=23 , pady=23)

b2 = Button(frame, fg="green", text="Print now" , command=display)
b2.pack(side=LEFT, padx=23 , pady=23)

b3 = Button(frame, fg="blue", text="Print now")
b3.pack(side=LEFT, padx=23 , pady=23)

b4 = Button(frame, fg="red", text="Print now")
b4.pack(side=LEFT, padx=23 , pady=23)

root.mainloop()
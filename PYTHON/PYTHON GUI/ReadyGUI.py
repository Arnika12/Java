# make 500x400 window with "ready" word at bottom in center

from tkinter import *
root = Tk()
root.geometry("500x400")
root.minsize(100,100)

root.title("Ready window for Software !")

label1 = Label(text= "Ready !" , bg="grey", fg="red",font="Verdana 20 bold")
# we used fill="x" here to modify a end strip size so that it will conver entire x axis
label1.pack(side=BOTTOM, fill="x") 

root.mainloop()
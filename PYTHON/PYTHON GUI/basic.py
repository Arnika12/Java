# making a window of pycharm of size 733 x 434
# add text into it

from tkinter import *

arnika_root = Tk() 

arnika_root.geometry("733x434")
arnika_root.minsize(200,200)

arnika = Label(text ="PyCharm Community Edition")
arnika.pack()

arnika_root.mainloop()
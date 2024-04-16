# --------------------  Inserting  png  image  ---------------------------------

# from tkinter import *
# arnika_root = Tk()

# arnika_root.geometry("733x434")
# arnika_root.minsize(200,200)

# photo = PhotoImage(file="img1.png")
# img_label = Label(image=photo)
# img_label.pack()

# arnika_root.mainloop()


# ----------------------  Inserting  jpg  image  --------------------------------------
from tkinter import *
from PIL import Image, ImageTk 

arnika_root = Tk()

arnika_root.geometry("733x434")
arnika_root.minsize(200,200)

image = Image.open("img4.jpg")
photo = ImageTk.PhotoImage(image)
img_label = Label(image=photo)
img_label.pack()

arnika_root.mainloop()
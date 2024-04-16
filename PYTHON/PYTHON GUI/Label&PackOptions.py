
from tkinter import *
root = Tk()
root.geometry("500x500")
root.minsize(250,350)

root.title("Python GUI Application ")  #title for window

#important label options
''' text - addds the text
bd - background
fg - foreground
font - sets the font    1. font= ("Verdana",20,"italic")
                        2. font= "Verdana 20 bold " 
padx - x padding
pady - y padding
relief - border styling - SUNKEN, RAISED, GROOVE, RIDGE '''

title_label = Label(text = "Artificial intelligence (AI) is the \n intelligence of machines and software, \n as opposed to the intelligence of \n humans and other living beings. \n It is a field of study in computer \n science that develops and studies intelligent machines."
                    , bg = "red", fg="white" , pady=94, padx=115, font= "Verdana 20 bold" , borderwidth=5 , relief=SUNKEN ) 


#Important Pack Options
# anchor = nw ,es (label will get move towards that position)
# side = top, bottom, left, right  (set position like top,botton,left,right)
# fill = X,Y,NONE,BOTH  means if we give fill=x then jaise hhum screen ki along x axis khichenge wo khichata chala jayega
# --------- Padding (to get element in middle of the page)
# padx = 30
# pady = 20

# title_label.pack(side=BOTTOM , anchor = "sw",fill=BOTH)
# title_label.pack(side=LEFT , anchor = "sw",fill=Y)
# title_label.pack(side=LEFT , anchor = "sw",fill=Y , padx=20,pady=30)
title_label.pack(fill=BOTH)





# title_label.pack()

root.mainloop()
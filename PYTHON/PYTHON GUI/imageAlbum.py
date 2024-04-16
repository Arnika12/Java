
from tkinter import *
import os
from PIL import ImageTk, Image

def read_image(filepath):
    """Reads an image file and returns a PhotoImage object."""
    image = Image.open('images')
    return ImageTk.PhotoImage(image)

# Get the current working directory
cwd = os.getcwd()

# Get a list of all the image files in the current working directory
image_files = [f for f in os.listdir(cwd) if f.endswith(".jpg")]

# Create a Tkinter window
root = Tk()

# Create a label widget to display the image
label = Label(root, image=read_image(image_files[0]))

# Pack the label widget into the window
label.pack()

# Start the Tkinter event loop
root.mainloop()
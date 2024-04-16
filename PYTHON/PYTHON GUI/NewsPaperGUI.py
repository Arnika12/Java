from tkinter import *
from PIL import Image, ImageTk 

def split_text(text, chunk_size=100):
    final_text = ""
    for i in range(0, len(text), chunk_size):
        final_text += text[i:i+chunk_size] + "\n"
    return final_text
      
root = Tk()
root.geometry("1000x800")
# root.minsize(200, 200)
root.title("NewsPaper GUI Application")

texts = []
photos = []

for i in range(3):
    try:
        with open(f"{i+1}.txt") as f:
            text = f.read()
            texts.append(split_text(text))
    except FileNotFoundError:
        texts.append("Text not available")

    try:
        image = Image.open(f"images/{i+1}.jpg")
        image = image.resize((150, 165))
        photos.append(ImageTk.PhotoImage(image))
    except FileNotFoundError:
        photos.append(None)

frame_titles = ["Akhabar", "February 21, 2024"]
for title in frame_titles:
    f = Frame(root, width=800, height=70)
    Label(f, text=title, font="Verdana 20 italic").pack()
    f.pack()

for i in range(3):
    f = Frame(root, width=900, height=200, pady=14)
    Label(f, text=texts[i], padx=22, pady=22 , font="Verdana 10 italic").pack(side="left")
    if photos[i]:
        Label(f, image=photos[i], anchor="e").pack()
    else:
        Label(f, text="Image not available").pack()
    f.pack(anchor="w")

root.mainloop()

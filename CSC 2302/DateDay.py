import calendar
from datetime import datetime
from tkinter import *
from tkinter import messagebox

def enter():
    my_str = entry_1.get()
    new_str = my_str.replace(",", "")
    my_date = datetime.strptime(new_str, "%b %d %Y")

    day = calendar.day_name[my_date.weekday()]

    messagebox.showinfo("", "{} was a {}".format(my_str, day))
    

gui = Tk()

LabelDate = Label(gui, text="Enter Date: ").grid(row = 0, column = 0)


entry_1 = Entry(gui)
entry_1.grid(row=0, column= 1)

EnterButton = Button(gui, text = "Enter", command = enter).grid(row = 1, column = 1)

gui.mainloop()
 













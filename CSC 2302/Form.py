#Question 2

from tkinter import *
from tkinter.messagebox import showinfo

def submit():
    print("Name: {} \nUser ID: {} \nPassword: {}".format(name.get(), user.get(), password.get()))
    print(name.get())

gui = Tk()



LabelName = Label(gui, text='Name: ')
LabelName.grid(row=0, column= 0)

name = Entry(gui)
name.grid(row=0, column= 1)

LabelUser = Label(gui, text='User: ')
LabelUser.grid(row=1, column= 0)

user = Entry(gui)
user.grid(row=1, column= 1)

LabelPass = Label(gui, text='Password: ')
LabelPass.grid(row=2, column= 0)

password = Entry(gui)
password.grid(row=2, column= 1)

Submit = Button(gui, text='Submit', command = submit)
Submit.grid(row = 3, column= 0, columnspan=2)


gui.mainloop()
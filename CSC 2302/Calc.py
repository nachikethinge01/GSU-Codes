#Question: 1

from tkinter import *

textBox = ''

def click(num):
    global textBox
    textBox = textBox + str(num)
    equation.set(textBox)

def clearButton():
    global textBox
    textBox = ""
    equation.set("")

def equalButton():

    try:
        global textBox
        total = str(eval(textBox))
        equation.set(total)
        textBox = ""

    except:
        equation.set("Cannot Solve")
        textBox = ""

if __name__ == "__main__":
    gui = Tk()
    gui.title("Calculator")
    gui.configure(background="grey")
    gui.geometry("265x125")
    equation = StringVar()
    textBox_field = Entry(gui, textvariable=equation)
    textBox_field.grid(columnspan=4, ipadx=70)

    button0 = Button(gui, text = '0', fg ='black', bg = 'grey', command=lambda: click(0), height=1, width=7)
    button0.grid(row = 5, column = 0)

    button1 = Button(gui, text = '1', fg ='black', bg = 'grey', command=lambda: click(1), height=1, width=7)
    button1.grid(row = 2, column = 0)

    button2 = Button(gui, text = '2', fg ='black', bg = 'grey', command=lambda: click(2), height=1, width=7)
    button2.grid(row = 2, column = 1)

    button3 = Button(gui, text = '3', fg ='black', bg = 'grey', command=lambda: click(3), height=1, width=7)
    button3.grid(row = 2, column = 2)

    button4 = Button(gui, text = '4', fg ='black', bg = 'grey', command=lambda: click(4), height=1, width=7)
    button4.grid(row = 3, column = 0)

    button5 = Button(gui, text = '5', fg ='black', bg = 'grey', command=lambda: click(5), height=1, width=7)
    button5.grid(row = 3, column = 1)

    button6 = Button(gui, text = '6', fg ='black', bg = 'grey', command=lambda: click(6), height=1, width=7)
    button6.grid(row = 3, column = 2)

    button7 = Button(gui, text = '7', fg ='black', bg = 'grey', command=lambda: click(7), height=1, width=7)
    button7.grid(row = 4, column = 0)

    button8 = Button(gui, text = '8', fg ='black', bg = 'grey', command=lambda: click(8), height=1, width=7)
    button8.grid(row = 4, column = 1)

    button9 = Button(gui, text = '9', fg ='black', bg = 'grey', command=lambda: click(9), height=1, width=7)
    button9.grid(row = 4, column = 2)

    plus = Button(gui, text = '+', fg ='black', bg= 'grey', command=lambda: click("+"), height=1, width=7)
    plus.grid(row = 2, column = 3)

    minus = Button(gui, text = '-', fg ='black', bg= 'grey', command=lambda: click("-"), height=1, width=7)
    minus.grid(row = 3, column = 3)

    muliply = Button(gui, text = '*', fg ='black', bg= 'grey', command=lambda: click("*"), height=1, width=7)
    muliply.grid(row = 4, column = 3)

    divide = Button(gui, text = '/', fg ='black', bg= 'grey', command=lambda: click("/"), height=1, width=7)
    divide.grid(row = 5, column = 3)

    equal = Button(gui, text = '=', fg ='black', bg= 'grey', command=equalButton, height=1, width=7)
    equal.grid(row = 5, column = 2)

    clear = Button(gui, text = 'clear', fg ='black', bg= 'grey', command=clearButton, height=1, width=7)
    clear.grid(row = 5, column = 1)


    gui.mainloop()

from tkinter import *
import random

List_of_entries =  ['Sanbid Roy Chowdhury', 'The refuge Malik', 'Google India', 'DotDotCom',
'Jon Layman', 'Itz Omen', 'Roberto Picco', 'Adigun olamide', 'Saurabh Parate', 'Exceptional Faruk',
'Avinash Upadhyaya', 'Fabio F. de Aquino', 'Ganesh Hegde', 'Hardy Don', 'Trap Town NCS',
'NIRMAL SRINIVAS CHINTALA', 'Weston', 'Gavin Hou', 'Bhanumathi A', 'Faoud Mohd ',
'rocket science', 'LucaVont', 'Kristian Simko', 'Lunar Atom', 'Code With Wasif', 'Shreyas shetty',
'Panagiotis V', 'Dan Esquibel', 'TechiesSpammer69', 'John Dripper', 'Barbossa', 'Sahan Eakanayaka',
'Cassio Lacaz', 'Ranga bharath', 'Kisalay Suman', 'Le Dung', 'Mildo', 'Ivan Yosifov',
'Shreyas shetty', 'pranav Bhatki', 'Atharv Nuthi', 'Tibas Tiba', 'Yash Thakkar', 'Dario', 
'deranged llama', 'Tom Blackwood', 'Christian Dimayacyac', 'Shaun A', 'Tchosk', 'Ahsan Arain',
'GRANDHI NAGESHWARAO', 'Baby Daily Life', 'PERFECT IGBADUMHE', 'Amad Ahmed',
'benage andy', 'Gerald Minoza', 'Samuel Hafer', 'Augusto Sousa', 'Andreas Mls', 'Somali flame', 
'GPSSerbia', 'Hima Subedi', 'Ignatus Nana Amoah', 'Videos Promoter', 'Nabil Fantes',
'collins anele', 'Utku Yucel', 'Robert Coffie', 'M Dandan', 'Hudaibia Syed', 'abdurrahman zakariya', 
'sabin katwal', 'Hardy Don', 'v sr', '10 bitangaje', 'Jon Bascos', 'Gaming Hub', 'Ace Hardy', 
'Arsh Bains', 'Hima Subedi', 'Samuel Hafer', 'Fake Account', 'Spider', 'Callum Telford',
'Nikola Franicevic', 'David Blankinship', 'Unison', 'ramona Saintandre', 'Mohan hari krishna']

def pick():
    rand_int = random.randint(0, 88)
    rand_word = List_of_entries[rand_int]

    label = Label(gui, text=rand_word)
    label.pack()

gui = Tk()
gui.geometry("265x125")


text = Label(gui, text="Win-O-Rama!")
text.pack()

button = Button(gui, text="PICK OUR WINNER!!!", command=pick)
button.pack()

gui.mainloop()


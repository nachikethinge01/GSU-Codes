check = False
x = input("Enter a word: ")
w = "" 
for i in x: 
    w = i + w 
    if (x == w): 
        check = True
print(check)


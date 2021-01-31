import string

chars = []
with open("text.txt", "r") as a:
    for i in a.read():
        chars.append(i)

capital = 0

for j in chars:
    if j in string.ascii_uppercase:
        capital += 1

print("Number of capital letters {}".format(capital))


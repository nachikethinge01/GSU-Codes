a = 0
rows = 9
for i in range(1, rows+1):
    for space in range(1, (rows-i)+1):
        print(end="  ")
    while a != (2*i-1):
        print("* ", end="")
        a = a + 1
    a = 0
    print()
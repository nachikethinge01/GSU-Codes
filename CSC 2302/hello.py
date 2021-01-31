'''
---------------Question 1-------------------
'''

'''
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
    '''


    ''' 
 ---------------Question 2-------------------
    '''


'''
x = input("Enter a word: ")
w = "" 
for i in x: 
    w = i + w 
    if (x==w): 
        print("True") 
print("False")
'''



'''
---------------Question 3-------------------
'''



'''
numList = []
number = int(input("Enter the total number of elements: "))

for i in range(1, number+1):
    num = int(input("Enter the value for number {}: ".format(i)))
    numList.append(num)

first = numList[0]
second = first

for j in range(1, number):
    if(numList[j] > first):
        second = first
        first = numList[j]
    elif(numList[j] > second and numList[j] < first):
        second = numList[j]

print("The second largest element is {}".format(second))
'''


'''
---------------Question 4-------------------
'''



inFile = open('text.txt')
inFile.read(1)
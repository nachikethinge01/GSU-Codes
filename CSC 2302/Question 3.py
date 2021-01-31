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
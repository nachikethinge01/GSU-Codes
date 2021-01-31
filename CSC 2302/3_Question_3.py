#Question 3
#I was not sure what does drawing flowchart means, so I drew an arrow showing it is a Flowchart

def checkOdd(ls):

    for i in range(len(ls)):
        for j in range(len(ls)):
            res = ls[i] * ls[j]
            if res & 1:
                return True
            return False


list1 = [2, 4, 6, 8]
list2 = [1, 3, 5, 9]
list3 = [1, 6, 4, 7, 8]

print(list1, u"\u2192", checkOdd(list1))
print(list2, u"\u2192", checkOdd(list2))
print(list3, u"\u2192", checkOdd(list3))
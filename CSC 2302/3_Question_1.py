#Question 1

d1 = {'a': 1, 'b' : 2, 'c': 3, 'd' : 4, 'e' : 3}
list =[] 

for i in d1.values(): 
  if i in list: 
    continue 
  else:
    list.append(i)

print(list)
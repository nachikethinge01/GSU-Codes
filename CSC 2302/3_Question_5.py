#Question 5

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class linked_list:
    def __init__(self):
        self.head = None
        self.tail = None
        self.counter = 0


    def append(self, data):
        node = Node(data)
        if self.head:
            self.head.next = node
            self.head = node
        else:
            self.tail = node
            self.head = node
        self.counter += 1


    def iterate(self):
        current = self.tail
        while current:
            value = current.data
            current = current.next
            yield value


list = linked_list()
list.append('Nachiket')
list.append('Hinge')
list.append("python")
list.append('list')
list.append('Dog')

for i in list.iterate():
    print(i)
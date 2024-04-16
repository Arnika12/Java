import array as arr

class Queue:
    def __init__(self, size):
        self.size = size
        self.queue = arr.array("i",[])

    def isEmpty(self):
        return len(self.queue) == 0

    def isFull(self):
        return len(self.queue) == self.size

    def enque(self, n):
        if self.isFull():
            print("Queue is full")
        else:
            self.queue.append(n)
            print("Element inserted in queue")

    def deque(self):
        if self.isEmpty():
            print("Queue is empty")
        else:
            ele = self.queue.pop()
            print("Element deleted:", ele)

    def peek(self):
        if self.isEmpty():
            print("Queue is empty")
        else:
            top_ele  = self.queue[self.top]
            print("Front element:", top_ele)

    def display(self):
        if self.isEmpty():
            print("Queue is empty")
        else:
            print("Queue elements:", *self.queue)


# Creating an instance of the Queue class
queue = Queue(3)

while True:
    print("\nQueue operations")
    print("1.enque\n2.deque\n3.display\n4.peek\n5.exit")
    b = int(input("Enter your choice (1/2/3/4/5): "))
    
    if b == 1:
        n = int(input("Enter element to add: "))
        queue.enque(n)
    elif b == 2:
        queue.deque()
    elif b == 3:
        queue.display()
    elif b == 4:
        queue.peek()
    elif b == 5:
        break
    else:
        print("Enter a valid choice")
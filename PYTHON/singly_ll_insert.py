#singly linked list 
class Node:
	def __init__(self,data):
		self.data=data
		self.next=None
class LinkedList:
	def __init__(self):
		self.head=None

	def insert_at_begin(self,data):
		new_node=Node(data)
		new_node.next=self.head
		self.head=new_node

	def insert_at_end(self,data):
		new_node=Node(data)
		if not self.head:
			self.head=new_node
			return
		current=self.head
		while current.next:
			current=current.next
		current.next=new_node

	def display(self):
		current=self.head
		while current:
			print(current.data,end="->")
			current=current.next
		print("None")

my_sl=LinkedList()

my_sl.insert_at_begin(1)
my_sl.insert_at_begin(100)
my_sl.insert_at_begin(1000)
my_sl.insert_at_end(20)
my_sl.insert_at_end(200)
my_sl.display()
		
			
	
	
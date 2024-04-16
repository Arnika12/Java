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


	def delete_at_begin(self,data):
		if not self.head:
			print("lit is empty")
			return
		self.head=self.head.next

	def delete_at_end(self,data):
		if not self.head:
			print("list is empty")
		current=self.head
		prev=None
		while current.next:
			prev=current
			current=current.next
		if prev:
			prev.next=None
		else:
			self.head=None
	def display(self):
		current=self.head
		while current:
			print(current.data,end="->")
			current=current.next
		print("None")
s_ll=LinkedList()
s_ll.insert_at_begin(10)
s_ll.insert_at_begin(110)
s_ll.insert_at_begin(120)
s_ll.insert_at_end(156)
s_ll.insert_at_begin(170)
s_ll.display()
s_ll.delete_at_begin(10)
s_ll.delete_at_begin(110)
s_ll.delete_at_end(170)
s_ll.display()

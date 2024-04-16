class animal:
    def eating(self):
        print("Eating")

class dog(animal):
    def bark(self):
        print("Bark")
        
d=dog()
d.eating()
d.bark()
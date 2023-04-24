"""
class Teacher(object):   #Parent class
    name="Graphic Era University"
    def show(self):
        print("Parent Class method")

class Student(Teacher):     #child class
    name1="The Asian School"
    def display(self):
        print("Child class method")   

obj1=Teacher()
obj2=Student()
#Now we can access parent class members using child class objects, vice versa not true
obj1.show()
obj2.display()
obj2.show()
"""

"""
#if child class constructor missing
class Parent:
    def __init__(self):
        print("Father class constructor")
class Child(Parent):
    pass
obj1=Child()
#python interpreter will look for child class constructor, if not found, it will look for it in the parent class, and will execute it
"""
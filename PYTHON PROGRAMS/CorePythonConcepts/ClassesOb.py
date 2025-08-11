"""
#Non patameterized constructor
class Student:
    def __init__(self):
        self.name="Sameer Upadhyay"
        self.age=20

obj1=Student()
obj2=Student()
print(obj1.__dict__)
print(obj2.__dict__)

"""

"""
#Parameterized constructor
class Student:
    def __init__(self,name,age):
        self.name=name
        self.age=age

obj1=Student("sameer",21)
obj2=Student("Marsh",49)
print(obj1.__dict__)
print(obj2.__dict__)
"""

"""
#Default constructor -->When no __init__ is declared, python automatically calls the default constructor, because without constructor, objects cant be created in python..that default constructor is empty

class Student:
    pass

Obj1=Student()      
"""

class Student:
    def __init__(self,name,age):
        self.name=name
        self.age=age

    def display(self):
        print("Name is",self.name,"and age is ",self.age)

obj1=Student("sameer",21)   #Creating object

print(obj1.name)            #Printing attributes 
print(obj1.age)

obj1.name="Maanasa"         #Changing values
obj1.age=18
obj1.display()              #Calling display method 

#Built in class methods
print(getattr(obj1,"name"))     #--->to get the value of an attribute
setattr(obj1,"name","Sameer")   #--->to change the value of an attribute
print(obj1.name)
delattr(obj1,"age")             #--->to delete an attribute
print(hasattr(obj1,"name"))     #--->returns true if the mentioned attribute is present and returns false if not

#to check if an object is of a particular class or not
print(isinstance(obj1,Student))



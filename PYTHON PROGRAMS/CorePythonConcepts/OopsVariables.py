"""
class Student:

    College="Graphic Era University" #Class Variable

    def __init__(self,name,age):
        self.name=name; #instance variable
        self.age=age;   #instance variable
        self.print_details();

    def print_details(self):    #instance method
        print("Name is: ",self.name);
        print("Age is: ",self.age);

obj1=Student("Sameer",20)

#To access Class variables
#print(Student.College) or print(obj1.College)

#Modifying class variable(only possible through class reference)
Student.College="The Asian School"
print(Student.College)

#if we modified using object reference
#obj1.College="The Asian School"  this will not affect the class variable
#here an instance variable will be created by name self.College inside init
"""

#We can also access class variables using Class methods
class Student:

    College="Graphic Era University"

    def __init__(self,name,age):
        self.name=name
        self.age=age
        print("Name: ",self.name)
        print("Age: ",self.age)
    
    @classmethod        #decorator
    def college_details(cls):   #takes cls as default just like self for instance variable
        cls.College="The Asian School" 
        print(cls.College);

obj1=Student("Sameer",21)
Student.college_details()





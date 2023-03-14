class A:
    def __init__(self,name,age):
        self.name=name
        self.age=age
        
obj1=A("Sameer",17)
obj2=A("Marshall",49)
obj3=A("Geminitay",25)

List1=[obj1,obj2,obj3]

for i in List1:
    print(i.name,i.age)
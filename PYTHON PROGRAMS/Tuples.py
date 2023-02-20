#declaring a tuple
tup1=("Sameer","Marshall","Geminitay","Sameer")   #any datatype, differnet datatype
print(tup1)

#Declaring a single tuple
tup2=("Sameer",)
print(type(tup2))

#Accessing tuples
print(tup1[2])
print(tup1[-4])
print(tup1[1:3])
print(tup1[-4:-1])
print(tup1[:2])
print(tup1[2:])
print("Sameer" in tup1)

#Updating tuples    (are immutable, cant be changed directly)

#to change values, first convert tuples to lists
list1=list(tup1)
list1[1]="Marshall Mathers"
tup1=tuple(list1)
print(type(tup1))
print(tup1)

#to append
list2=list(tup2)
list2.append("Minecraft")
tup2=tuple(list2)
print(tup2)

#it is possible to add a tuple to another tuple
tup3=tup1+tup2
print(tup3)

#unpacking a tuple
tup4=("Apple","Banana","Cherry")
(green,yellow,red)=tup4
print(green)
print(yellow)
print(red)

#if variables<items
tup5=("Apple","Banana","Cherry","Grapes","Kiwi")
(f1,f2,*f3)=tup5
print(f1)
print(f2)
print(f3)

#if * used somewhere else
tup6=("Apple","Banana","Cherry","Grapes","Kiwi")
(fr1,*fr2,fr3)=tup6
print(fr1)
print(fr2)
print(fr3)

for i in range(len(tup6)):
    print(tup6[i])

i=0;
while i<len(tup6):
    print(tup6[i])
    i+=1

#to multiply two tuples
tup7=(10,20,30)
print(tup7)
tup7=tup7*2
print(tup7)

#count method
print(tup7.count(10))

#index method
print(tup3.index("Sameer"))
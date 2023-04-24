#declaring a tuple
tup1=("Sameer","Marshall","Geminitay","Sameer")   #any datatype
print(tup1)

#Declaring a single tuple
tup2=("Sameer",)
print(type(tup2))

#Accessing tuples
print(tup1[2])
print(tup1[-4])
print(tup1[:])      #range from start to end
print(tup1[1:3])
print(tup1[-4:-1])  #negative ranges
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

tup3=("apple","samsung","microsoft","redmi")
for x in tup3:
    print(x)
for i in range(len(tup3)):
    print(tup3[i])
i=0
while i<len(tup3):
    print(tup3[i])
    i=i+1

#adding and multiplying tuples
tup4=(10,20,30)
tup5=(40,50,60)
tup6=tup4+tup5
print(tup6)
tup7=tup4*3
print(tup7)


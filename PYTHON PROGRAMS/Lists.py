list1=[10,20,30,40,50]
list2=[60,70,80,90,100]

#changable, ordered, allow duplicates
list1[2]=50
print(list1)

#accessing elements
print(list1[:])         #all elements
print(list1[:4])        #starts from 0
print(list1[2:])        #goes till last
print(list1[2:4])       #accessing through positive range
print(list[-3])         #all range types allowed with -ve indexing as well

#accessing through loops
for x in list1:
    print(x)
for i in range(len(list2)):
    print(list2[i])
i=0
while i<len(list1):
    print(list1[i])
    i=i+1

#sort lists
list3=["yamaha","TVS","Kawasaki","royal enfield"]
list3.sort()
print(list3)
list3.sort(reverse=True)
print(list3)
list3.sort(key=str.lower)       #ignore case sensitive
print(list3)
list3.sort(key=str.lower, reverse=True) #ignore case sensitivity in descending
print(list3)

#add two lists
list4=list1+list2
print(list4)

#list methods
list5=["samsung","redmi","oppo","vivo","micromax","asus"]
list5.append("iphone")
print(list5.count("samsung"))
print(list5.index("oppo"))
list5.pop(3)
list5.remove("redmi")
list6=list5.copy()
list6.extend(list4)
print(list6)
print(list5)

list7=["apple","banana","kiwi","cherry"]
for x in list7:
    if x=="apple":
        id=list7.index("apple")
        list7[id]="mango"
print(list7)
"""User input heterogenous list, find string with the maximum length, print in uppercase, print the index and convert that string to tuple"""


#Asking elements from the user
l1=[]
le=int(input("Enter length: "))
for i in range(0,le):
    l1.append(eval(input("Enter element: ")))
print("Original list: ",l1)


#Seperating string type elements to a different list
l2=[]
for i in l1:
    if type(i)==str:
        l2.append(i)


#Stroing length of every string to a different list
l3=[]
for i in l2:
    l3.append(len(i))


maximum=max(l3) #Finding maximum length
ele=l2[l3.index(maximum)]  #finding the element with maximum length
print("Element with the maximum length: ",ele)


#Converting into upper case
upper=""
for i in ele:
    asi=ord(i)
    d=asi-32
    upper=upper+chr(d)
print("Max Length element in uppercase: ",upper)


#Finding the index of the max element
ind=l1.index(ele)
print("Index of max length element in the original list: ",ind)


#Converting the max element into tuple  
tup=tuple(ele)
print("Converting into tuple: ",tup)
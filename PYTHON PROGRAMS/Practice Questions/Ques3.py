"""
#Display the file extension
str=input("Enter a file name: ")
l1=str.split('.') 
print("File extension: ",l1[-1])
"""

"""
#compute (n+nn+nnn)
num=int(input("Enter a number: "))
result=(num+(num*num)+(num*num*num))
print("Result: ",result)
"""

"""
#comma seperated value,store them into list and tuple
str=input("Enter a string with comma seperated values: ")
l1=str.split(',')
print("List: ",l1)
tup=tuple(l1)
print("Tuple: ",tup)
"""

"""
#indexes of all numbers below threshold
le=int(input("Enter length: "))
l1=[]
l2=[]
for i in range(0,le):
    l1.append(int(input("Enter element: ")))
threshold=int(input("Enter threshold value: "))

for i in range(0,le):
    if l1[i]<=threshold:
        ind=l1.index(l1[i])
        l2.append(ind)
print(l2)
"""

"""
#print one character ahead
str=input("Enter a string: ")
l1=[]
for i in range(0,len(str)):
    f=ord(str[i])
    l1.append(chr(f+1))
print(l1)
"""

"""
#list input and print print elements as one string with space
le=int(input("Enter length: "))
l1=[]
for i in range(0,le):
    l1.append(input("Enter element: "))

for i in range(0,le):
    print(l1[i]+" ",end="")
"""

"""
#Index of all strings in a list whose length is a multiple of 5
le=int(input("Enter length: "))
l1=[]
d={}
for i in range(0,le):
    l1.append(input("Enter element: "))
for i in range(0,le):
    if len(l1[i])%5==0:
        ind=l1.index(l1[i])
        d.update({l1[i]:ind})
print(d)
"""
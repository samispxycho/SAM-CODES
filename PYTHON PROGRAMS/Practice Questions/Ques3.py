"""
#Display the file extension
str=input("Enter a file name: ")
l1=str.split('.') 
print("File extension: ",l1[-1])
"""

"""
#without split
str=input("Enter a file name: ")
str1=str[::-1]
str=""
for i in range(0,len(str1)):
    if str1[i]==".":
        break
    str=str+str1[i]
print("Extension is:",str[::-1])
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


num1=int(input("Enter a number: "))
num2=int(input("Enter a number: "))

for i in range(num1,num2):
    count=1
    j=2
    while j<=i:
        if i%j==0:
            count+=1
        j+=1
    
    if count==2:
        print(i)

"""


"""

*
**
***
**
*



i=1
while i<=3:
    j=1
    while j<=i:
        print("*",end="") 
        j+=1
    print()
    i+=1
i=1
while i<=2:
    j=2
    while j>=i:
        print("*",end="")
        j-=1
    print()
    i+=1

"""

"""
st=input("Enter a string: ")
st1=""

for i in range(0,len(st)):
    st1=st[i]+st1

if st==st1:
    print("Pallindrome string")
else:
    print("Not")
"""


email=input("Enter your email: ")
l1=email.split("@")
print(l1[0])
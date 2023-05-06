"""
num1=int(input("Enter a number: "))
l1=[]
while num1>0:
    d=num1%10
    l1.append(d**2)
    num1=num1//10
print(l1[::-1])
"""

"""
num1=int(input("Enter a range: "))
i=1
l1=[]
while i<=num1:
    l1.append(i**2)
    i+=1
print(l1)
"""
"""
l1=[10,-20,30,-40,0,50,-60]
posi=[]
nega=[]
for i in l1:
    if i==0:
        continue
    elif i>0:
        posi.append(i)
    else:
        nega.append(i)
print(posi)
print(nega)
"""

"""
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

i=1
while i<=5:
    j=1
    while j<=i:
        print("*",end=" ")
        j+=1
    print()
    i+=1
i=1
while i<=4:
    j=4
    while j>=i:
        print("*",end=" ")
        j-=1
    print()
    i+=1
"""

"""
num=int(input("Enter a range: "))
i=2
while i<=num:
    j=1
    count=0
    while j<=i:
        if i%j==0:
            count+=1
        j+=1
    if count==2:
        print(i)
    i+=1
"""

"""
le=int(input("Enter length: "))
l1=[]
lp=[]
ln=[]
for i in range(0,le):
    l1.append(int(input("Enter element: ")))
print("Original list: ",l1)

for i in l1:
    j=1
    count=0
    while j<=i:
        if i%j==0:
            count+=1
        j+=1
    if count==2:
        lp.append(i)
    else:
        ln.append(i)
    i+=1
print("Prime list: ",lp)
print("Non prime list: ",ln)
"""

"""
1
2 3
4 5 6

"""

"""
i=1
c=1
while i<=4:
    j=1
    while j<=i:
        print(c,end=" ")
        j+=1
        c+=1
    print()
    i+=1
"""

"""
s1=input("Enter your name: ")
s2=""
l1=['a','e','i','o','u','A','E','I','O','U']
for i in range(0,len(s1)):
    if s1[i] in l1:
        continue
    else:
        s2=s2+s1[i]
print(s2)
"""
"""
str1=input("Enter a string: ")
str2=input("Enter a substring: ")
value=0
for i in range(0,len(str2)):
    if str1[i]==str2[i]:
        value=1
    else:
        value=0
if value==1:
    print("Given string starts with the provided substring.")
else:
    print("Given string does not starts with the provided substring.")
"""

"""
l1=[13,19,15,18,21]
l1.sort()
print("Original list: ",l1)
ele=int(input("Enter element to search: "))

low=0
high=len(l1)-1

while low<high:
    mid=(low+high)//2
    if l1[mid]==ele:
        print("Element found at: ",mid)
        break
    elif l1[mid]<ele:
        low=mid
    else:
        high=mid
"""

"""
s1=input("Enter a string: ")
l1=['a','e','i','o','u','A','E','I','O','U']

vowels=0
consonents=0
digits=0
special_chr=0

for i in range(0,len(s1)):
    if s1[i].isalpha():
        if s1[i] in l1:
            vowels+=1
        else:
            consonents+=1
    elif s1[i].isdigit():
        digits+=1
    else:
        special_chr+=1
print("Vowels: ",vowels)
print("Consonents: ",consonents)
print("Digits: ",digits)
print("Special characters: ",special_chr)
"""

"""
s="sameer"
l1=[]
for i in range(0,len(s)):
    d=ord(s[i])
    l1.append(chr(d+1))
print(l1)
"""

"""
num=int(input("Enter a number: "))
num1=num
result=0
while num>0:
    d=num%10
    result=result+(d**3)
    num//=10
if num1==result:
    print("Armstrong")
else:
    print("Not")
"""

"""
num=int(input("Enter range: "))
a=1
b=2
print(a)
print(b)
for i in range(2,num+1):
    c=a+b
    print(c)
    a=b
    b=c
"""

"""
num=int(input("Enter a number: "))
fact=1
for i in range(1,num+1):
    fact=fact*i
print(fact)
"""

"""
num1=int(input("Enter a number: "))
num2=int(input("Enter a number: "))

if num1>num2:
    max1=num1
    min1=num2
else:
    max1=num2
    min1=num1

hcf=0
for i in range(1,min1+1):
    if num1%i==0 and num2%i==0:
        hcf=i
print("Hcf is ",hcf)
"""
"""
num1=int(input("Enter a number: "))
num2=int(input("Enter a number: "))

if num1>num2:
    max1=num1
    min1=num2
else:
    max1=num2
    min1=num1


for i in range(max1,(max1*min1)+1):
    if i%num1==0 and i%num2==0:
        print(i)
        break
"""


"""
str1=input("Enter a string: ")
l1=[]
dic={}
for i in range(0,len(str1)):
    l1.append(str1[i])
l1.sort()

for i in l1:
    if i in dic:
        dic[i]+=1
    else:
        dic[i]=1
print(dic)
"""


"""
l1=[13,15,10,25,7,23]
l1.sort()
print("Sorted list: ",l1)

ele=int(input("Enter element to search: "))
low=0
high=len(l1)-1

while low<=high:
    mid=(low+high)//2
    if l1[mid]==ele:
        print("Element found at index: ",mid)
        break
    elif ele<l1[mid]:
        high=mid
    else:
        low=mid
"""

"""
l1=["RPQ","BAD","AXN","PAD"]
l2=[]
for i in l1:
    l2.append(sorted(i))
print(l2)
l1.clear()
for i in l2:
    s=""
    for j in i:
        s+=j
    l1.append(s)
l1.sort()
print(l1)
"""

"""
le=int(input("Enter length: "))
l1=[]
lp=[]
ln=[]
for i in range(0,le):
    l1.append(int(input("Enter element: ")))
print("Original list: ",l1)

for i in l1:
    j=1
    count=0
    while j<=i:
        if i%j==0:
            count+=1
        j+=1
    if count==2:
        lp.append(i)
    else:
        ln.append(i)
    i+=1
print("Prime list: ",lp)
print("Non prime list: ",ln)
"""

"""
l1=[19,15,13,17,12]
lp=[]
for i in l1:
    j=1
    c=0
    while j<=i:
        if i%j==0:
            c+=1
        j+=1
    if c==2:
        lp.append(i)
print(lp)
"""
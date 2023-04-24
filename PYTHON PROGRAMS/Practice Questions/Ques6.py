"""
#factors

num=int(input("Enter a number: "))
for i in range(1,num+1):
    if num%i==0:
        print(i)
"""

"""
#factorial
num1=int(input("Enter a number: "))
result=1
while num1>0:
    result=result*num1
    num1-=1
print(result)
"""

"""
#String frequency into a dictionary
l1=["hello","world"]
l2=[]
for i in l1:
    for j in i:
        l2.append(j)
l2.sort()

d={}
for ele in l2:
    if ele in d:
        d[ele]+=1
    else:
        d[ele]=1
print(d)
"""

"""
#one character ahead
s=input("Enter a string: ")
s1=""
for i in range(0,len(s)):
    c=ord(s[i])
    a=chr(c+1)
    s1=s1+a
print(s1)
"""

"""
l1=[]
le=int(input("Enter length: "))
for i in range(0,le):
    l1.append(input("Enter element: "))

l2=[]
for i in l1:
    if len(i)>=5:
        l2.append(l1.index(i))


d={}
for i in l2:
    d.update({l1[i]:i})
print(d)
"""

"""
num1=int(input("Enter a number: "))
num2=int(input("Enter a number: "))

min=num1
if num2>num1:
    min=num2

hcf=0
for i in range(1,min+1):
    if num1%i==0 and num2%i==0:
        hcf=i
print(hcf)


num1=int(input("Enter a number: "))
num2=int(input("Enter a number: "))

max,min=0,0

if num1>num2:
    max=num1
    min=num2
else:
    max=num2
    min=num1

for i in range(min,(max*min)+1):
    if i %num1==0 and i%num2==0:
        print(i)
        break
        
"""
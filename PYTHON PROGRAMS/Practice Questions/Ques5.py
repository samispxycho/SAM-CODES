"""
l1=[]
le=int(input("Enter length: "))
for i in range(0,le):
    l1.append(input("Enter element: "))

l2=[]
for i in l1:
    for j in i:
        l2.append(j)
l2.sort()


dic={}
for ele in l2:
    if ele in dic:
        dic[ele]+=1
    else:
        dic[ele]=1
print(dic)
"""
"""
#Armstrong number
num1=int(input("Enter a number: "))
num2=num1
count=0
result=0

while num1>0:
    count+=1;
    num1=num1//10

num1=num2

while num2>0:
    d=num2%10
    result=result+(d**count)
    num2//=10

if result==num1:
    print("Armstrong")
else:
    print("Not armstrong")
"""

#Fibonaci series
le=int(input("Enter length: "))
l1=[1,1]
for i in range(0,le-2):
    l1.append(l1[i]+l1[i+1])
print(l1)
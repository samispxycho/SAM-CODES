"""
#interchange first and last element of a list

l1=[]
le=int(input("Enter the length of list: "))

def intake():
    for i in range(0,le):
        l1.append(int(input("Enter element: ")))
    print("Original list: ",l1)

def outake():
    temp=l1[0]
    l1[0]=l1[le-1]
    l1[le-1]=temp
    print("New list: ",l1)


intake()
outake()
"""

"""
#Numbers which are divisible by 7 and are multiple of 5 between 1500 and 3000
for i in range(1500,3001):
    if i%7==0 and i%5==0:
        print(i)
"""

"""
#All numbers from 0 to n, except those which are pallindrome
n=int(input("Enter a number: "))
for i in range(0,n+1):
    num=i
    rev=0
    while num>0:
        d=num%10
        rev=(rev * 10)+d
        num=num//10
    if rev==i:
        continue
    else:
        print(i)
"""

"""
#Above question using while loop
n=int(input("Enter a number: "))
i=0
while(i<=n):
    num=i
    rev=0
    while(num>0):
       
        l_d=num%10
        rev=rev*10+l_d
        num=num//10
    if(rev!=i):
        print(i)
    i+=1
"""

"""
#1 to 50 iteration, for multiple of 3 print "choclate" , for 5 print "burger" for both print "Choclate burger "
for i in range(1,51):
    if i%3==0 and i%5==0:
        print("Choclate burger")
    elif i%3==0:
        print("Choclate")
    elif i%5==0:
        print("Burger")
    else:
        print(i)
"""

"""
str=input("Enter a file name: ")
l1=list(str.split("."))
print(l1[-1])
"""
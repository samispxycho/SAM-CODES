"""
#Write a Python function to find the maximum of three numbers

def maxi(a,b,c):
    if a>b>c or a>c>b:
        print(a, "is the maximum number")
    elif b>a>c or b>c>a:
        print(b," is the maximum number")
    elif c>a>b or c>b>a:
        print(c," is the maximum number")

maxi(10,20,13)
"""

"""
#take list from user, print the sum of elements
def list1(list1):
    sum=0
    for i in list1:
        sum+=i
    return sum

l=int(input("Enter length: "))
l1=[]
for i in range(0,l):
    l1.append(int(input("Enter element: ")))
print("Original list: ",l1)

total=list1(l1)
print("Sum of all the numbers is: ",total)
"""
"""
#py function to reverse a string

def rev(string):
    s1=""
    for i in range(0,len(string)):
        s1=string[i]+s1
    return s1

s1=rev("Sameer")
print(s1)
"""

"""
# Write a Python function that accepts a string and counts the number of upper and lower case letters
def string(string):
    upper=0
    lower=0
    for i in range(0,len(string)):
        if string[i].isupper():
            upper+=1
        elif string[i].islower():
            lower+=1
    print("Upper case count: ",upper)
    print("lower case count: ",lower)

string("The quick Brow Fox")
"""

"""
#Write a Python function that takes a list and returns a new list with distinct elements from the first list

def dlist(list1):
    l1=[]
    for i in list1:
        if i not in l1:
            l1.append(i)
    return l1

l3=[10,20,10,40,75,35,20]
l2=dlist(l3)
print(l2)
"""

"""
#Write a Python program to print the even numbers from a given list.
def even(list):
    l1=[]
    for i in list:
        if i%2==0:
            l1.append(i)
    return l1

l2=[]
le=int(input("Enter length: "))
for i in range(0,le):
    l2.append(int(input("Enter element: ")))

final=even(l2)
print(final)
"""
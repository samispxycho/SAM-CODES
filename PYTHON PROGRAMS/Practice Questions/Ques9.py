#1.	Write a Python function that accepts a string and counts the number of upper and lower case letters.

def count(s):
    upper=0
    lower=0
    for char in s:
        if char.isupper():
            upper+=1
        elif char.islower():
            lower+=1      
    print("Upper case count: ",upper)
    print("lower case count: ",lower)

count("The quick Brow Fox")

#Ques 2:2.	Write a Python function that takes a list and returns a new list with distinct elements from the first list.

#Sample List : [1,2,3,3,3,3,4,5]
#Unique List : [1, 2, 3, 4, 5]

def uniq(l):
    s=set(l)
    return list(s)

print(uniq([1,2,3,3,3,3,4,5]))
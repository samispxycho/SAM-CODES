"""
#Normal function
def isgreater(a,b):
    if a>b:
        return a
    else:
        return b
    
num=isgreater(13,10)
print("The greater number is: ",num)
"""

"""
#default args
def sum(a=100,b=50):
    print("Sum is : ",a+b)

sum()
sum(20,10)
sum(20)
sum(b=20)          
"""

"""
#Keyword args
def name(fname,mname,lname):
    print("Your name: ",fname,mname,lname)

name(mname="Sameer",lname="Peter",fname="Upadhyay")
"""

"""
def average(*numbers):
    sum1=0
    for i in numbers:
        sum1+=i
    print("Average is: ",sum1/len(numbers))
    print(type(numbers))

average(10,20,30,40,50,60)
"""

"""
#Multiple *s arent allowed
def name(*fname,*lname):    #this is invalid
    pass                    
"""


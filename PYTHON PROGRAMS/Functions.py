"""
def isgreater(a,b):
    if a>b:
        print(a," is the larger number")
    else:
        print(b," is the larger number")
isgreater(20,30)

def vals(*values):
    print(values)

vals(10,20,30,40,50)

def coun(country="India"):
    print("I am from ",country)

coun("Norway")
coun("Australia")
coun()
coun("America")

def calc(x):
    product=x*10
    return product
"""

def add(*nums):
    return nums

s=add(10,20,30,40,50)
print(type(s))
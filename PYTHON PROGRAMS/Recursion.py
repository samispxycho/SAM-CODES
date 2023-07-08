"""
#Table program
def table(num,r):
    if(r==0):
        return 
    else:
        table(num,r-1)
        print(num,"*",r,"=",num*r)

table(2,3)
"""

"""
#Sum of numbers
def s(r):
    if(r==1):
        return (1)
    else:
        return(r+s(r-1))
print(s(4))
"""

"""
#Factorial
def fact(num):
    if(num==0):
        return 1
    else:
        return(num*fact(num-1))
print(fact(5))
"""

"""
#Power
def power(n,p):
    if(p==0):
        return 1
    else:
        return (n*power(n,p-1))
    
print(power(3,2))
"""

"""
#Fibonacci
def fibo(n):
    if(n==0):
        return 0
    if(n==1):
        return 1
    else:
        return(fibo(n-1)+fibo(n-1))

for i in range(0,11):
    print(fibo(i),end="")
"""

#Even odd
def c(l,e=0,o=0):
    if(not l):
        return e,o
    else:
        if l[0]%2==0:
            e+=1
        else:
            o+=1
        return(c(l[1:],e,o))
    
l=[2,3,4,5,6]
e,o=c(l)

print(e)
print(o)
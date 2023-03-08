#reverse a number
num1=int(input("Enter a number "))
rev=0
while(num1>0):
    d=num1%10
    rev=(rev * 10)+d
    num1=num1//10
print(rev)

#pallindrome
num2=int(input("Enter a number "))
num3=num2
rev=0
while num2>0:
    d=num2%10
    rev=(rev * 10)+d
    num2=num2//10
if rev==num3:
    print("Pallindrome")
else:
    print("Not pallindrome")

#String pallindrome
str=input("Enter a string ")
s=""
l=(len(str))-1
while l>=0:
    d=l%10
    s=s+str[l]
    l=l-1
if s==str:
    print("Pallindrome string")
else:
    print("Not a pallindrome string")

#even odd 
num4=int(input("Enter a number "))
if num4==0 or num4==1:
    print("Number is neither even nor odd")
elif num4%2==0:
    print(num4," is an even number")
else:
    print(num4," is an odd number")

#prime
num5=int(input("Enter a number "))
c=1
for i in range(2,num5+1):
    if num5 % i==0:
        c+=1
        i+=1
if c==2:
    print(num5," is a prime number")
else:
    print(num5," is not a prime number")




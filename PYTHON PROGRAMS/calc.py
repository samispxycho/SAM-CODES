#MINI PROJECT: CALCULATOR USING FUNCTIONS

#defining functions
def add(num1,num2):
    print("Addition of the numbers is ",num1+num2)
def sub(num1,num2):
    print("Substraction of the numbers is ",num1-num2)
def mul(num1,num2):
    print("Multiplication of the numbers is ",num1*num2)
def div(num1,num2):
    print("Division of the numbers is ",num1/num2)
def mod(num1,num2):
    print("Remainder of the numbers is ",num1%num2)


#Asking numbers and operations to calculate
n1=int(input("Enter your first number: "))
n2=int(input("Enter your second number: "))
op=input("Enter your desired operation \n1) Addition\n2) Substraction\n3) Multiplication\n4) Division\n5) Modulus\n6) All\n\n")

#code
if op=="Addition":
    add(n1,n2)
elif op=="Substraction":
    sub(n1,n2)
elif op=="Multiplication":
    mul(n1,n2)
elif op=="Division":
    div(n1,n2)
elif op=="Modulus":
    mod(n1,n2)
elif op=="All":
    add(n1,n2)
    sub(n1,n2)
    mul(n1,n2)
    div(n1,n2)
    mod(n1,n2)
else:
    print("Invalid operation entered.")





num1=100
num2=200

if num1>num2:
    print(num1," is greater")
else:
    print(num2," is greater")

print (num1," is greater") if num1>num2 else print(num2 ," is greater")

print(num1,"is greater") if num1>num2 else print(num2," is greater") if(num2>num1) else print("Numbers are equal")

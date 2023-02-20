#Basic calculator using python programming language

#Printing the available operations that can be performed
print("Press 1 to perform addition")
print("Press 2 to perform substraction")
print("Press 3 to perform multiplication")
print("Press 4 to perform division")
print("Press 5 to perform modulus")
print("Press 6 to calculator power")
print("Press 7 to exit the system")

while True:
    #taking choice of operation from user
    choice=eval(input("Enter your choice of operation: "))

    #passing user's choice through a match case
    match choice:
        case 1:
            num1=int(input("Enter your first number "))
            num2=int(input("Enter your second number "))
            print("The output is ",num1+num2)
        case 2:
            num1=int(input("Enter your first number "))
            num2=int(input("Enter your second number "))
            if num1>num2:
                print("The output is ",num1-num2)
            elif num2>num1:
                print("The output is ",num2-num1)
            else:
                print("The output is zero")
        case 3:
            num1=int(input("Enter your first number "))
            num2=int(input("Enter your second number "))
            print("The output is ", num1*num2)
        case 4:
            num1=int(input("Enter your first number "))
            num2=int(input("Enter your second number "))
            if num1>num2:
                print("The output is ",num1/num2)
            elif num2>num1:
                print("The output is ", num2/num1)
            else:
                print("The output is one")
        case 5:
            num1=int(input("Enter your first number "))
            num2=int(input("Enter your second number "))
            if num1>num2:
                print("The output is ", num1%num2)
            elif num2>num1:
                print("The output is ", num2%num1)
            else:
                print("The output is zero")
        case 6:
            num1=int(input("Enter the number whose power you want to calculate "))
            num2=int(input("Enter the power value "))
            print("The output is ",num1**num2)
        case 7:
            exit(True)
        case _:
            print("Please enter a valid choice of operation")



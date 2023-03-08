class calc:
    def __init__(self,n1,n2):
        self.num1=n1;
        self.num2=n2;
        self.menu()
    
    def menu(self):
        while True:
            ch=int(input("""
                Press 1 to perform addition
                Press 2 to perform substraction
                Press 3 to perform multiplication
                Press 4 to perform division
                Press 5 to exit
        """))
        
            if ch==1:
                self.add()
            elif ch==2:
                self.sub()
            elif ch==3:
                self.mul()
            elif ch==4:
                self.div()
            elif ch==5:
                exit()
            else:
                print("Enter valid choice of operation")
    
    def add(self):
        print("Addition of the numbers provided is ",self.num1+self.num2)
    
    def sub(self):
        print("Substraction of the numbers provided is ",self.num1-self.num2)

    def mul(self):
        print("Multiplication of the numbers provided is ",self.num1*self.num2)
    
    def div(self):
        print("Division of the numbers provided is ",self.num1/self.num2)
        
no1=int(input("Enter your first number "))
no2=int(input("Enter your second number "))
obj=calc(no1,no2)
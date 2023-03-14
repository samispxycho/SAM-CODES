class Atm:
    def __init__(self):
        self.__pin=17042003;
        self.____balance=54000;
        self.__menu();

    def __menu(self):
        while True:
            ch=int(input("""
                Hello, how would you like to proceed?
                Enter 1 to create a new pin.
                Enter 2 to deposit.
                Enter 3 to withdraw.
                Enter 4 to check balance.
                Enter 5 to exit.   
"""))
            if ch==1:
                self.create_pin()
            elif ch==2:
                self.deposit()
            elif ch==3:
                self.withdraw();    
            elif ch==4:
                self.check_balance();
            elif ch==5:
                exit()
            else:
                print("Enter a valid operation")

    def create_pin(self):
        self.__pin=int(input("Enter your new pin "));
        print("Pin set successfully");
    def deposit(self):
        temp=int(input("Enter your pin "))
        if temp==self.__pin:
            amount=int(input("Enter the amount"))
            self.__balance=self.__balance+amount;
            print("Amount deposited successfully")
        else:
            print("Invalid pin entererd")
    def withdraw(self):
        temp=int(input("Enter your pin "))
        if temp==self.__pin:
            amount=int(input("Enter the amount"))
            if amount<=self.__balance:
                print("Transaction on process, please wait")
                self.__balance=self.__balance-amount
            else:
                print("Insufficient amount entered")
        else:
            print("Invalid pin entered")
    def check_balance(self):
        temp=int(input("Enter your pin "))
        if temp==self.__pin:
            print("Your current account balance is ",self.balance)
        else:
            print("Invalid pin entererd")


#out of class
obj=Atm()
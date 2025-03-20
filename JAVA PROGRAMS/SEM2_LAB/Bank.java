package SEM2_LAB;

abstract class Bankkk{
    int balance;
    Bankkk(int balance){
        this.balance=balance;
    }

    void deposit(int amount){
        balance+=amount;
        System.out.println("Amount deposited");
        System.out.println("New balance: "+balance);
    }

    abstract void withdraw(int amount);
}

class CustomerAccount extends Bankkk{

    CustomerAccount(int balance){
        super(balance);
    }

    void withdraw(int amount){
        if(balance<=250){
            System.out.println("Amount cant be withdrawed");
            return;
        }
        balance=balance-amount;
        System.out.println("Money Withdrawed: "+amount);
        System.out.println("Balance left: "+balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        CustomerAccount obj = new CustomerAccount(100);
        obj.deposit(0);
        obj.withdraw(100);
    }
}

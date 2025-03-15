package SEM2_LAB;

import java.util.Scanner;

class Bank{
    int balance;
    Bank(int balance){
        this.balance=balance;
    }

    void deposit(int amount){
        balance+=amount;
        System.out.println("Money Deposited");
    }

    void withdrawl(int amount){
        balance=balance-amount;
        System.out.println(amount+" money withdrawled");
    }

}

class  CustAccount extends Bank{
    CustAccount(int balance){
        super(balance);
    }
    void withdrawl(int amount){
        if(balance-amount>=250){
            balance=balance-amount;
            System.out.println("Money withdrawled");
            System.out.println("Balance left: "+balance);
        }else{
            System.out.println("Balance less than 250, withdraw not possible");
        }
    }
}

public class BankDetails {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Balance: ");
        int balance=sc.nextInt();
        CustAccount customer=new CustAccount(balance);

        System.out.print("Enter amount to deposit: ");
        int deposit=sc.nextInt();
        customer.deposit(deposit);

        System.out.print("Enter money to withdrawl: ");
        int with=sc.nextInt();
        customer.withdrawl(with);

    }
}

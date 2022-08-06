package practical_2_2;
import java.util.*;
import java.lang.*;
import java.util.Scanner;
public class Account {
    Scanner x = new Scanner(System.in);
    private int id = 0;
    private double balance = 500;
    private double annualInterestRate = 7;
    private Date dateCreated;
    public Account() {
    }
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*(getMonthlyInterestRate()/12)/100;
    }
    public int Withdraw(){
        System.out.print("Enter Withdraw Amount: ");
        double w = x.nextInt();
        if(balance>w) {
            System.out.print("Total balance in your account is : " );
            balance=balance-w;
        }
        else if(balance<w)
            System.out.println("Not enough money, Check your bank balance");
        return (int) (balance);
    }
    public int deposit(){
        System.out.print("Enter Deposit Amount: ");
        int d = x.nextInt();
        System.out.print("Total balance in your account is : ");
        return (int) (balance+d);
    }
}



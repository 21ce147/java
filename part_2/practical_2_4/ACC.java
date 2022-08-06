package practical_2_4;

public class ACC {
    private int id=0;
    double balance=500,annualInterest=7,amount;
    String dateCreated;
    ACC() {
        id=0;
        balance=6000;
    }
    ACC(int i,double b) {
        id=i;
        balance=b;
    }
    void setdata(int i,double b,double aInt,String d) {
        id=i;
        balance=b;
        annualInterest=aInt;
        dateCreated=d;
    }
    int getId() {
        return id;
    }
    double getBalance() {
        return balance;
    }
    double getAnnualInterest() {
        return annualInterest;
    }
    double getMonthlyInterestRate() {
        return (annualInterest*100)/12;
    }
    double getMonthlyInterest() {
        return balance*(annualInterest*100)/12;
    }
    String getDateCreated() {
        return dateCreated;
    }
    void withdraw(double a) {
        balance-=a;
        if(balance>0)
            System.out.println("withdrawal of Rs."+a+" is Successfully Done");
        else
            System.out.println("Withdrawal of Rs."+a+" is not possible!!");

        System.out.println("Total balance in your account is : " + balance );
    }
    void deposit(double a) {
        balance+=a;
        System.out.println("Deposit of Rs."+a+" is Successfully Done");
        System.out.println("Total balance in your account is : " + balance );
    }
}

class SavingAccount extends ACC {
    SavingAccount(double x) {
        amount=x;
        balance-=amount;
    }
    public String toString() {
        if(balance>=4000) {
            return "The balance left after withdrawal of Rs."+amount+" is Rs. "+balance;
        }
        else {
            return "Over Draft Limit Not Possible!!\nMinimum Rs. 4000 is required.";
        }
    }
}

class CheckingAccount extends ACC {
    CheckingAccount(double y) {
        amount = y;
        balance-=amount;
    }
    public String toString() {
        System.out.println("Withdrawal Successful!");
        return "Now the balance left is Rs."+balance+" after the withdrawal of Rs."+amount;
    }
}


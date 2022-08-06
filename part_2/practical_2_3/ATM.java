package practical_2_3;
import java.lang.*;
import java.util.*;
public class ATM {
    String id;
    int balance;
    ATM(String i) {
        id = i;
        balance = 300;
    }
    void BalanceInq() {
        System.out.println("*--> Balance Inquiry");
        System.out.println("Balance : " + balance);
    }
    void withdraw() {
        System.out.println("\n*--> withdraw");
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Withdraw Amount: ");
        a = sc.nextInt();
        if(balance - a > 300)
            System.out.println("Not enough money, Check your bank balance");

        else {
            balance = balance - a;
            System.out.println("Total balance in your account is : " + balance );
        }
    }
    void deposit() {
        System.out.println("\n*--> Deposit");
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Deposit Amount: ");
        b = sc.nextInt();
        balance = balance + b;
        System.out.println("Total balance in your account is : " + balance );
    }
    void moneyTransfer(ArrayList ar) {
        System.out.println("\n*--> moneyTransfer");
        int c;
        String id;
        Scanner sc = new Scanner(System.in);
        ATM ac = null;
        System.out.print("Enter ID to transfer : ");
        id = sc.next();
        Iterator itr = ar.iterator();
        while(itr.hasNext()) {
            ATM a = (ATM) itr.next();
            if(id.equals(a.id))
                ac = a;
        }
        if(ac == null)
            System.out.println("Account not exist");
        else {
            System.out.print("Enter amount to transfer : ");
            c = sc.nextInt();
            if(c > balance) {
                System.out.println("Not enough money, Check your bank balance to transfer");
            }
            else {
                ac.balance = ac.balance+c;
                balance = balance-c;
            }
        }
        System.out.println("Total balance in your account is : " + balance );
    }
    void Create(ArrayList arr) {
        System.out.println("\n*--> Creating ID");
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        str = sc.next();
        ATM ac = new ATM(str);
        arr.add(ac);
    }
    void delete(ArrayList arr) {
        System.out.println("\n*--> Deleting ID");
        String str;
        Scanner sc = new Scanner(System.in);
        ATM ac = null;
        System.out.print("Enter ID : ");
        str = sc.next();
        Iterator itr = arr.iterator();
        while(itr.hasNext()) {
            ATM a = (ATM) itr.next();
            if(str.equals(a.id))
                ac = a;
        }
        if(ac == null)
            System.out.println("Account not exist");
        else {
            arr.remove(ac);
            System.out.println("Account removed successfully");
        }
    }
}


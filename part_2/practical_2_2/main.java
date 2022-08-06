//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package practical_2_2;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Account a = new Account();
        Scanner x = new Scanner(System.in);
        System.out.println("1. Monthly Interest Rate of Account");
        System.out.print("Your monthly interest rate is :");
        System.out.println(a.getMonthlyInterestRate());
        System.out.print("Your Monthly interest is :");
        System.out.println(a.getMonthlyInterest());
        System.out.println("\n2. Withdraw");
        System.out.println(a.Withdraw());
        System.out.println("\n3. deposit");
        System.out.println(a.deposit());
    }
}


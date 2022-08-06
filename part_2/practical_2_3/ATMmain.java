//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package practical_2_3;
import java.util.ArrayList;
import java.util.Scanner;
public class ATMmain {
    public static void main(String[] args) {
        ArrayList<ATM> arr = new ArrayList<ATM>();
        Scanner sc = new Scanner(System.in);
        boolean f = true;
        String str;
        ATM ac = null;
        ATM a = new ATM(null);
        arr.add(new ATM("AC001"));
        arr.add(new ATM("AC002"));
        arr.add(new ATM("AC003"));
        arr.add(new ATM("AC004"));
        arr.add(new ATM("AC005"));
        arr.add(new ATM("AC006"));
        arr.add(new ATM("AC007"));
        arr.add(new ATM("AC008"));
        arr.add(new ATM("AC009"));
        arr.add(new ATM("AC010"));
        System.out.print("Enter your ID : ");
        str = sc.next();
        for (ATM A : arr) {
            if (str.equals(A.id)) {
                ac = a;
                break;
            }
        }
        if (ac == null) {
            System.out.println("Invalid ID");
            System.exit(0);
        }
        else {
            ac.BalanceInq();
            ac.withdraw();
            ac.deposit();
            ac.moneyTransfer(arr);
            ac.Create(arr);
            ac.delete(arr);
        }
    }
}



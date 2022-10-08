//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_7.pr7_3;
import java.util.*;
public class main {
    public static void main(String[] args) {
        int count = 0;
        ArrayList a = new ArrayList<>();
        ArrayList<AccountHolder> personHolder = new ArrayList<AccountHolder>();
        AccountHolder.Pr3();
        for (int i = 1; i <= 1; i++) {
            personHolder.add(new AccountHolder());
        }
        for (AccountHolder p : personHolder) {
            p.info();
            p.check();
            if (p.age >= 21 && p.age <= 60 && p.inc >= 15000 && p.we >= 1) {
                System.out.println("You are Elligeble**");
                count++;
                a.add(p.name);
            } else {
                System.out.println("You Are Not Elligeble!!!");
            }
        }
    }
}

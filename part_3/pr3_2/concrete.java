//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_3.pr3_2;
import java.util.Scanner;
interface IPrinter{
    void add();
}
interface IScanner {
    void multi();
}
class concrete implements IPrinter , IScanner {
    Scanner sc=new Scanner(System.in);
    public void multi() {
        System.out.print("Enter Numbers For Multiplication : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Multiplication of " + x + " * " + y + " = " + (x*y)+ "\n");
    }
    public void add() {
        System.out.print("Enter Numbers For Addition : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Addition of " + x + " + " + y + " = " + (x+y));
    }
}

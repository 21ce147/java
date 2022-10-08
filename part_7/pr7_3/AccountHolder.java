//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_7.pr7_3;
import java.util.*;
public class AccountHolder {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int we;
    double inc;
    String czs;
    static void Pr3() {
    }
    void info() {
        System.out.println("Enter Your Name : ");
        name = sc.next();
        System.out.println("Enter Your Age : ");
        age = sc.nextInt();
        System.out.println("Enter Your Net Monthly Income : ");
        inc = sc.nextDouble();
        System.out.println("Enter Your Total Work Experience : ");
        we = sc.nextInt();
        System.out.println("What is Your CitizenShip? : ");
        czs = sc.next();
    }
    void check() {
        System.out.println("\nYour Name is : " + name);
        System.out.println("Your Age is : " + age);
        System.out.println("Your Monthly Income is : " + inc);
        System.out.println("Your Work Experience is : " + we);
        System.out.println("You Are A  " +czs+" Citizenship ");
    }

}

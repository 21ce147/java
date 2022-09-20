//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_4;
public class pr4_2  {
    public static void checkNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");
        }
        else {
            System.out.println("Square of " + num + " is " + (num*num));
        }
    }
}

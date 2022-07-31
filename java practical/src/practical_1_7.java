//21CE147__UMAT_VISHVDIP
//git@github.com:21ce147/java.git
import java.util.*;
public class practical_1_7 {
    private static final String str = " ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        for (int row = 0; row <= 7; row++) {
            for (int column = 1; column <= 7 - row; column++) {
                System.out.printf("%4s", str);
            }
            for (int column = 0; column <= row; column++) {
                number = (int) Math.pow(2, column);
                System.out.printf("%4d", number);
            }
            for (int column = row - 1; column >= 0; column--) {
                number = (int) Math.pow(2, column);
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
        sc.close();
    }
}
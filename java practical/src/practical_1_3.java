//21CE147__UMAT_VISHVDIP
//git@github.com:21ce147/java.git
import java.util.*;
class practical_1_3 {
    public static void main(String args[]) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        if(num1%10==num2%10) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }
}
//21CE147__UMAT_VISHVDIP
//git@github.com:21ce147/java.git
import java.util.*;
import static java.lang.Math.min;
public class practical_1_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String : ");
        String a=sc.next();
        System.out.println("Enter Second String : ");
        String b=sc.next();
        int s=stringMatch(a,b);
        System.out.println(s);
        sc.close();
    }
    public static int stringMatch(String x,String y) {
        int count=0;
        int f=min( x.length(),y.length());
        for(int i=0;i<f-1;i++) {
            String z=x.substring(i,i+2);
            String t=y.substring(i,i+2);
            if(z.equals(t)) {
                count++;
            }
        }
        return count;
    }
}
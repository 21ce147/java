//21CE147__UMAT_VISHVDIP
//git@github.com:21ce147/java.git
import java.util.*;
public class practical_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");

        int a = sc.nextInt();
        String[] b = new String[a];
        System.out.println("Enter elements of array : ");

        for (int i=0; i<b.length; i++) {
            b[i] = sc.next();
        }
        System.out.println("Enter string you want to remove");
        String c = sc.next();
        wordsWithout(b, c);
        sc.close();
    }
    static void wordsWithout(String x[],String y) {
        int count=0;
        for(int i=0;i<x.length;i++) {
            if(x[i].equals(y)) {
                count++;
            }
        }
        String[] d=new String[x.length-count];
        int j=0;
        for(int i=0;i<x.length;i++) {
            if(!x[i].equals(y)) {
                d[j]=x[i];
                j++;
            }
        }
        System.out.println("New Array is :");
        for(String element:d) {
            System.out.print(element);
        }
    }
}
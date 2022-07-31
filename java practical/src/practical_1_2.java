//21CE147__UMAT_VISHVDIP
//git@github.com:21ce147/java.git
import java.lang.constant.Constable;
import java.util.Scanner;

public class practical_1_2 {

    public static Constable startOz(String check){
        if(check.startsWith("oz"))
            return "oz";
        else if(check.startsWith("z" , 1))
            return "z";
        else if(check.startsWith("o"))
            return "o" ;
        else
            return "" ;
    }
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        String a1 = n.next();
        String a2 = n.next();
        String a3 = n.next();
        System.out.println(startOz(a1));
        System.out.println(startOz(a2));
        System.out.println(startOz(a3));
    }
}

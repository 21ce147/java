//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package practical_2_5;
public class main {
    public static void main(String args[]) {
        Addition s = new Addition();
        System.out.print("Addition of  10 & 20 : ");
        System.out.println(s.Add(10, 20));
        System.out.print("Addition of  10 & 20 : ");
        System.out.println(s.Add(10.5, 20.5));
        System.out.print("Addition of  10, 20 & 30  : ");
        System.out.println(s.Add(10, 20, 30));
    }
}

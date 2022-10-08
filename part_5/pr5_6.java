//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_5;
public class pr5_6 {
    public static void main(String[] args) {
        int a = 1;
        double b = 1.12;
        Integer a_obj = Integer.valueOf(a);
        Double b_obj = Double.valueOf(b);
        if (a_obj instanceof Integer) {
            System.out.println("Integer is created.");
        }
        if (b_obj instanceof Double) {
            System.out.println("Double is created.");
        }
    }
}


//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_4;
public class pr4_3 {
    public static void main(String[] args) {
        try{
            try{
                System.out.print("1--> ");
                int a =10/0;
            }
            catch(ArithmeticException e) {
                System.out.println(e);
            }

            try {
                System.out.print("2--> ");
                String a = "Hello";
                char c = a.charAt(6); // in given string there is no 6th element
                System.out.println(c);
            }
            catch(StringIndexOutOfBoundsException e) {
                System.out.println(e);
            }

            try{
                System.out.print("3--> ");
                int a[]=new int[5];
                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }

        }
        catch(Exception e) {
            System.out.println("Exception in outer catch");
        }

        finally {
            System.out.println("Finally Done.");
        }
    }
}

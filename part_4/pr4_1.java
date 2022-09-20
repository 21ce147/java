//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_4;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class pr4_1 {
    public static void main(String args[])
    {
        try {
            int a = 10/0;
            System.out.println (a);//  10/0 don't exist
        }
        catch(ArithmeticException e) {
            System.out.println ("1: \"Divide by 0\" or Arithmetic Exception");
        }

        try {
            String a = "Hello";
            char c = a.charAt(6); // in given string there is no 6th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("2: String Index Out Of Bounds Exception");
        }

        try {
            String a = null; //null value
            System.out.println(a.charAt(5)); // given string is null so there is no elements
        }
        catch(NullPointerException e) {
            System.out.println("3: NullPointer Exception");
        }

        try{
            int a[] = new int[10];
            a[11] = 20; // can't access 7th element of array
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("4: Array Index is Out Of Bounds Exception");
        }

        try {
            int a = Integer.parseInt ("Java") ; // "java" is not a number
            System.out.println(a);
        } catch(NumberFormatException e) {
            System.out.println("5: Number format Exception");
        }

        try {
            File a = new File("\"C:\\Users\\PC\\Downloads\""); // No such file exist

            FileReader b = new FileReader(a);
        } catch (FileNotFoundException e) {
            System.out.println("6: \"File not found\" Exception");
        }
    }
}

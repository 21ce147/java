//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_5;
import java.util.*;
import java.io.*;
public class pr5_2 {
    public static void main(String[] args)
            throws IOException {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("C:/Users/UMAT/OneDrive/Desktop");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
            System.out.println("Program successfully executed");
        }
        finally {
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}
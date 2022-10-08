//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class pr5_4 {
    public static void main(String[] args) {
        FileInputStream f1 = null;
        FileOutputStream f2 = null;
        try {
            f1 = new FileInputStream("Desktop/first.txt" );
            f2 = new FileOutputStream("Desktop/second.txt");
            int temp;
            while ((temp = f1.read()) != -1) {
                f2.write(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (f1 != null) {
                try {
                    f1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (f2 != null) {
                try {
                    f2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


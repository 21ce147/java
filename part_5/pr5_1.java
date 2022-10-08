//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_5;
import java.io.*;
public class pr5_1 {
    public static void main(String[] args) {
        String path = "";
        boolean bool = false;
        try {
            File f = new File("NewFile.txt");
            f.createNewFile();
            System.out.println(f);
            File f2 = f.getCanonicalFile();
            System.out.println(f2);
            bool = f2.exists();
            path = f2.getAbsolutePath();
            System.out.println(bool);
            if (bool) {
                System.out.print(path + " Exists? " + bool);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


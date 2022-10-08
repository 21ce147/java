//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_5;
import java.io.*;
import java.util.*;
public class pr5_3 {
    public static void transfer(File a, File b)
            throws Exception {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);
        try {
            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source filename from where you want to read/copy :");
        String a = sc.nextLine();
        File x = new File(a);
        System.out.println("Enter the destination filename where you want to write/paste :");
        String b = sc.nextLine();
        File y = new File(b);
        transfer(x, y);
        sc.close();
    }
}

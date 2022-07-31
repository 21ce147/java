//21CE147__UMAT_VISHVDIP
//git@github.com:21ce147/java.git
import java.util.*;
public class practical_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = array123(arr);
        if (d == 1) {
            System.out.println("true");
        }
        if (d == 0) {
            System.out.println("false");
        }
        sc.close();
    }
    public static int array123(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] == 1) {
                if (a[i + 1] == 2) {
                    if (a[i + 2] == 3) {
                        c = 1;
                        break;
                    }
                }
            }
            else {
                continue;
            }
        }
        return c;
    }
}

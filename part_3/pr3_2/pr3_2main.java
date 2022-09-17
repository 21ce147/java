//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_3.pr3_2;
import java.util.Vector;
public class pr3_2main {
    public static void main(String[] args) {
        concrete a[] = new concrete[5];
        a[0] = new concrete();
        a[1] = new concrete();
        a[2] = new concrete();
        a[3] = new concrete();
        a[4] = new concrete();
        Vector<concrete> obj1 = new Vector<>();
        obj1.add(a[0]);
        obj1.add(a[1]);
        obj1.add(a[2]);
        obj1.add(a[3]);
        obj1.add(a[4]);
        for (int i = 0; i < 5; i++) {
            a[i].add();
            a[i].multi();
        }
    }
}

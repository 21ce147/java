//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_6.pr6_5;
public class pr6_5 {
    int n;
    boolean valueSet = false;
    synchronized int get() throws InterruptedException {
        while (!valueSet) {
            wait();
        }
        System.out.println("Get value "+n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n) throws InterruptedException {
        while (valueSet) {
            wait();
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put value "+n);
        notify();
    }
}

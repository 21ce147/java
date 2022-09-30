//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_6.pr6_5;
public class producer implements Runnable {
    pr6_5 t;
    public producer(pr6_5 test) {
        this.t = test;
    }
    @Override
    public void run() {
        int value = 0;
        while (value <= 10) {
            try {
                t.put(value++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

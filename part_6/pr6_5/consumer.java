//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_6.pr6_5;
public class consumer implements  Runnable{
    pr6_5 t;
    public consumer(pr6_5 test) {
        this.t = test;
    }
    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {
            try {
                t.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

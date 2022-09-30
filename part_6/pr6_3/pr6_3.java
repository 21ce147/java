//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_6.pr6_3;
public class pr6_3 {
    public static void main(String[] args) {
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Output : ");
                        for (int i = 10; i < 16; i++) {
                            System.out.println(i);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
        t.start();
    }

}

//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_6.pr6_4;
public class pr6_4 {
    public static void main(String[] args) {
                Thread first = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("FIRST");
                    }
                }, "FIRST");
        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("SECOND");
            }
        }, "SECOND");
        Thread third = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("THIRD");
            }
        }, "THIRD");
        second.setPriority(Thread.NORM_PRIORITY);
        first.setPriority(second.getPriority()-2);
        third.setPriority(second.getPriority()+2);
        first.start();
        second.start();
        third.start();
    }
}

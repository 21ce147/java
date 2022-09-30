//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_6.pr6_1;
public class pr6_1main {
    public static void main(String[] args) {
        pr6_1_A a = new pr6_1_A();
        Thread b = new Thread(new pr6_1_B());
        a.start();
        b.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hello World : Main");
    }
}

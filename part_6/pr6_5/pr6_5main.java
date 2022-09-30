//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_6.pr6_5;
public class pr6_5main {
    public static void main(String[] args) {
        pr6_5 test = new pr6_5();
        Thread producer = new Thread(new producer(test));
        Thread consumer = new Thread(new consumer(test));
        producer.start();
        consumer.start();
    }
}

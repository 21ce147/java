//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_6.pr6_2;
public class pr6_2 {
    public static void main(String[] args) {
        int array[] = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100.0 + 1.0);
        }
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < array.length; i += 2) {
                    System.out.println(" At index : "+ i + " : This is odd number : " + array[i]);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {for (int j = 0; j < array.length; j += 2) {
                    System.out.println(" At index : "+ j + " : This is even number : " + array[j]);
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}


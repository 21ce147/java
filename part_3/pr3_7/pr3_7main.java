//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_3.pr3_7;
class pr3_7main implements interface3_7 {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String args[]) {
        pr3_7main d = new pr3_7main();
        d.add(4, 5);
        d.show();
    }
}

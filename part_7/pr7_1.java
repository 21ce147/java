//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_7;
public class pr7_1 {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Integer[] intArray = { 3, 2, 1, 2, 3 };
        Double[] doubleArray = { 3.33, 4.44, 3.33, 4.44 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println("Integer Array contains:");
        printArray(intArray);
        System.out.println("\nDouble Array contains:");
        printArray(doubleArray);
        System.out.println("\nCharacter Array contains:");
        printArray(charArray);
    }
}

//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_7;
public class pr7_2 {
    static int countOccurrences(String str, String word) {
        String a[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i]))
                count++;
        }
        return count;
    }
    public static void main(String args[]) {
        String str = "hello friends , friends ";
        String word = "friends";
        System.out.println(countOccurrences(str, word));
    }
}




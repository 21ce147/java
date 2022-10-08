//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
public class pr5_5 {
    public static void main(String[] args) throws IOException {
        DataInputStream inputStream = null;
        DataOutputStream outputStreamEven = null;
        DataOutputStream outputStreamOdd = null;
        try {
            inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("first.txt")));
            outputStreamEven = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("even.txt")));
            outputStreamOdd = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("odd.txt")));
            int number;
            String textinput;
            double doublenumber;
            number = inputStream.readInt();
            textinput = inputStream.readUTF();
            doublenumber = inputStream.readDouble();
            while ((number = inputStream.read()) % 2 != 0) {
                outputStreamOdd.writeInt(number);
                outputStreamOdd.writeUTF(textinput);
                outputStreamOdd.writeDouble(doublenumber);
            }
            while ((number = inputStream.read()) % 2 == 0) {
                outputStreamEven.writeInt(number);
                outputStreamEven.writeUTF(textinput);
                outputStreamEven.writeDouble(doublenumber);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStreamEven != null) {
                outputStreamEven.close();
            }
            if (outputStreamOdd != null) {
                outputStreamOdd.close();
            }
        }
    }
}

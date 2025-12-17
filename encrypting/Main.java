import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        (new Main()).init();
    }

    void print(Object o) {
        System.out.println(o);
    }

    void init() {
        int randomNum = randInt(1, 255);
        String msg = "Hi yo";
        System.out.println(msg);
        int[] encodedMessage = e(msg, randomNum);
        for (int i : encodedMessage) {
            System.out.print(i + " ");
        }
        System.out.println();

        String decodedMessage = decoderunner(encodedMessage, randomNum);
        System.out.println(decodedMessage);
    }

    int[] e(String s, int randomNum) {
        int[] newarray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            newarray[i] = s.charAt(i) + randomNum;
        }
        return newarray;
    }

    String decoderunner(int[] array, int randomNum) {
        char[] chars = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            chars[i] = decodefr(array[i], randomNum);
        }
        return new String(chars);
    }

    char decodefr(int thenum, int randomNum) {
        thenum = thenum - randomNum;
        return (char) thenum;
    }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
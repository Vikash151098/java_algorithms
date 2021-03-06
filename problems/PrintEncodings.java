package problems;

import java.util.*;

public class PrintEncodings {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printEncodings("123", "");

    }

    static String data[] = { "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    public static void printEncodings(String str, String ans) {
        int strLength = str.length();
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        int singleChar = 0;
        int doubleChar = 0;
        if (strLength > 0)
            singleChar = Integer.parseInt(str.substring(0, 1));
        if (str.length() > 1) {
            doubleChar = Integer.parseInt(str.substring(0, 2));
        }
        if (singleChar > 0) {
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(0);
            printEncodings(sb.toString(), ans + data[singleChar]);
        }

        if (doubleChar < 27) {
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(0);
            sb.deleteCharAt(0);
            printEncodings(sb.toString(), ans + data[doubleChar]);
        }

    }

}
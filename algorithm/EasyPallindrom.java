package algorithm;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;

public class EasyPallindrom {
    static int d = 0;
    static String last_string;

    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();

        int d = 0;
        String last_string = str;
        while (!(n % 2 != 0 && isPallindrom(str))) {
            if (n % 2 == 0 && isPallindrom(str)) {
                d++;
                last_string = str.substring(n / 2, n);
                str = str.substring(0, n / 2);
                n /= 2;
            } else {
                str = LongestPallindrom(str);
                last_string = str;
                n = str.length();
            }

        }
        System.out.println(d);
        System.out.println(last_string);

    }

    static boolean isPallindrom(String str) {
        boolean flag = true;
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            char c_l = str.charAt(i);
            char c_r = str.charAt(n - i - 1);
            if (c_l != c_r) {
                flag = false;
            }

        }
        return flag;
    }

    static String LongestPallindrom(String str) {
        int maxLength = 1, start = 0;
        // Nested loop to mark start and end index
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;

                // Check palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;

                // Palindrome
                if (flag != 0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }
        return str.substring(start, start + maxLength);
    }

}

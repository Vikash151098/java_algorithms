
/*
 Input :ankur kumar
 
 Output:bolvs lvnbs
 */

// package coding;

package problems;

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int spaces = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaces++;
            }
        }
        String s[] = new String[spaces + 1];
        String text = "";
        int k = 0;
        int wordcount = 1;
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) != ' ') {
                if (wordcount % 2 == 0) {
                    char ch = input.charAt(j);
                    text = ch + text;
                } else {
                    int p = input.charAt(j);
                    char ch = (char) (p + 1);
                    text += ch;
                }

            } else {
                s[k] = text;
                text = "";
                k++;
                wordcount++;
            }
        }
        s[k] = text;
        for (int j = 0; j < spaces; j++) {
            System.out.print(s[j] + " ");
        }
        System.out.println(s[spaces]);
    }
}

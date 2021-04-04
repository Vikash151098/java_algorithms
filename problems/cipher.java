package problems;

import java.util.Scanner;

class cipher {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int k = scn.nextInt();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            int d = str.charAt(i) - k % 26;
            if (d < 65) {
                d = d + 26;
            }
            res = res + (char) d;
        }
        System.out.println(res);
        scn.close();
    }
}
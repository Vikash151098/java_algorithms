package problems;

import java.util.*;

class Pattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int a = n, p = n / 2, q = 0;
        boolean flag = false;
        while (a > 0) {
            for (int i = 0; i < p; i++) {
                System.out.print("\t");
            }
            System.out.print("*");
            if (a == n / 2 + 1 && flag == false) {
                flag = true;
            }
            if (a == n || a == 1) {
                if (flag == true) {
                    p++;
                    q -= 2;
                    a--;
                } else {
                    p--;
                    q += 2;
                    a--;
                }
                System.out.println();
                continue;
            }
            for (int j = 0; j < q; j++) {
                System.out.print("\t");
            }
            System.out.print("*");
            System.out.println();
            if (flag == true) {
                p++;
                q -= 2;
            } else {
                p--;
                q += 2;
            }

            a--;
        }
        scn.close();

    }
}
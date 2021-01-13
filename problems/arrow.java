package problems;

import java.util.*;

public class arrow {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int a = n, p = 1;
        boolean flag = false;
        while (a > 0) {
            if (a == n / 2 + 1) {
                for (int i = 0; i < n / 2; i++) {
                    System.out.print("*\t");
                }
                flag = true;
            } else {
                for (int i = 0; i < n / 2; i++) {
                    System.out.print("\t");
                }
            }

            for (int j = 0; j < p; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (flag == true) {
                p--;
            } else {
                p++;
            }
            a--;
        }

        scn.close();

    }
}
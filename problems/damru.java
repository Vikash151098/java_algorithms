package problems;

import java.util.*;

public class damru {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int a = n, p = 0, q = n - 2, r = 1;
        while (a > 0) {
            if (a > n / 2 + 1) {
                for (int i = 0; i < p; i++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int j = 0; j < q; j++) {
                    if (q == n - 2) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }

                }
                System.out.println("*\t");
                p++;
                q -= 2;
            } else {
                for (int i = 0; i < p; i++) {
                    System.out.print("\t");
                }
                for (int j = 0; j < r; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
                p--;
                r += 2;
            }
            a--;
        }
        scn.close();
    }
}

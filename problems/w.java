package problems;

import java.util.*;

public class w {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int a = n, p = n / 2 - 2, q = 1;
        while (a > 0) {
            if (a > n / 2 + 1) {
                System.out.print("*\t");
                for (int i = 0; i < n - 2; i++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
            } else if (a == n / 2 + 1) {
                System.out.print("*\t");
                for (int i = 0; i < n / 2 - 1; i++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int i = 0; i < n / 2 - 1; i++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
            } else if (a > 1) {
                System.out.print("*\t");
                for (int i = 0; i < p; i++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int i = 0; i < q; i++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int i = 0; i < p; i++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int i = 0; i < n / 2 - 1; i++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                p--;
                q += 2;
            } else {
                System.out.print("*\t");
                for (int i = 0; i < n - 2; i++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
            }
            System.out.println();
            a--;
        }
        scn.close();

    }
}

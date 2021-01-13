package problems;

import java.util.*;

public class swistic {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int a = n;
        while (a > 0) {

            if (a == n) {
                for (int j = 0; j <= n / 2; j++) {
                    System.out.print("*\t");
                }
                for (int j = 0; j < n / 2 - 1; j++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");

            } else if (a < n && a > n / 2 + 1) {
                for (int j = 0; j < n / 2; j++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int j = 0; j < n / 2 - 1; j++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
            } else if (a == n / 2 + 1) {
                for (int i = 1; i <= n; i++) {
                    System.out.print("*\t");
                }

            } else if (a < n / 2 + 1 && a > 1) {

                System.out.print("*\t");
                for (int j = 0; j < n / 2 - 1; j++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int j = 0; j < n / 2; j++) {
                    System.out.print("\t");
                }
            } else {
                System.out.print("*\t");
                for (int j = 0; j < n / 2 - 1; j++) {
                    System.out.print("\t");
                }

                for (int j = 0; j <= n / 2; j++) {
                    System.out.print("*\t");
                }
            }
            System.out.println();
            a--;
        }

        scn.close();

    }
}

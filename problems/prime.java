package problems;

import java.util.*;

public class prime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            boolean flag = false;
            for (int j = 2; j <= n / 2; j++) {
                if (n % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }

        }

        scn.close();
    }
}

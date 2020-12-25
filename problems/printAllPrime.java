package problems;

import java.util.*;

public class printAllPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int i = low; i <= high; i++) {
            int div = 2;
            while (div * div <= i) {
                if (i % div == 0) {
                    break;
                }
            }
            if (div * div > i) {
                System.out.print(i);
            }
        }
        sc.close();

    }
}

package problems;

import java.util.Scanner;

public class diceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == sum) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}

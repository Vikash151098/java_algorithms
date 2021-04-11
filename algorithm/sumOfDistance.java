package algorithm;

import java.util.Scanner;

public class sumOfDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int b = sc.nextInt();
            sum = sum + Math.abs(b - a);
            a = b;
        }
        System.out.println(sum);

    }
}

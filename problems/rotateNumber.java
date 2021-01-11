package problems;

import java.util.*;

class totateNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = n;
        int d = 0;
        while (a > 0) {
            a = a / 10;
            d++;
        }
        int arr[] = new int[d];
        int i = 0;
        while (n > 0) {
            arr[i] = n % 10;
            n = n / 10;
            i++;
        }
        if (k < 0) {
            k = d - (-k % d);
        }
        int output[] = new int[d];
        int number = 0;
        for (int j = 0; j < arr.length; j++) {
            output[j] = arr[k % d];
            k++;
        }

        for (int p = output.length - 1; p >= 0; p--) {
            number = number * 10 + output[p];
        }
        System.out.println(number);

        sc.close();
    }
}

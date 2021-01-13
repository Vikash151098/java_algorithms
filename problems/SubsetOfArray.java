package problems;

import java.util.*;

public class SubsetOfArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        int twoPowerN = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            twoPowerN *= 2;
        }
        int a[] = new int[n];
        for (int i = 0; i < twoPowerN; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] == 0) {
                    System.out.print("-\t");
                } else {
                    System.out.print(arr[j] + "\t");
                }

            }
            int p = n - 1, sum;
            sum = a[p] + 1;
            a[p] = (sum) % 2;
            int carry = sum / 2;
            p--;
            while (carry > 0 && p >= 0) {
                sum = a[p] + carry;
                a[p] = (sum) % 2;
                carry = sum / 2;
                p--;

            }
            System.out.println();
        }
        scn.close();

    }

}
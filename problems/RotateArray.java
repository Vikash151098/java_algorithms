package problems;

import java.io.*;

public class RotateArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] a, int k) {
        int n = a.length;
        if (k < 0) {
            k = n + (-k % n);
        } else {
            k = n - k % n;
        }
        int output[] = new int[n];
        for (int j = 0; j < a.length; j++) {
            output[j] = a[k % n];
            k++;
        }
        for (int j = 0; j < a.length; j++) {
            a[j] = output[j];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}

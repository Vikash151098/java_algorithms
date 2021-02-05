package problems;

/**
 * spiraltraverseArray
 */

import java.util.*;

public class spiraltraverseArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int minr = 0, minc = 0, count = 0, maxr = n - 1, maxc = m - 1;

        while (count < n * m) {

            for (int i = minr, j = minc; i <= maxr && count < n * m; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;

            for (int i = maxr, j = minc; j <= maxc && count < n * m; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            for (int i = maxr, j = maxc; i >= minr && count < n * m; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            for (int i = minr, j = maxc; j >= minc && count < n * m; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;

        }

        scn.close();
    }

}
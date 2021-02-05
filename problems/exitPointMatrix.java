package problems;

import java.util.*;

public class exitPointMatrix {

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
        int i = 0, j = 0;
        boolean leftToRight = true, rightToLeft = false, upToBottom = false, bottomToUp = false;
        while (i >= 0 || i < n || j >= 0 || j < m) {
            // System.out.println(i+" "+j);
            if (leftToRight) {
                j++;
            } else if (rightToLeft) {
                j--;
            } else if (upToBottom) {
                i++;
            } else if (bottomToUp) {
                i--;
            }
            if (arr[i][j] == 1) {
                if (leftToRight) {
                    upToBottom = true;
                    leftToRight = false;

                } else if (rightToLeft) {
                    rightToLeft = false;
                    bottomToUp = true;

                } else if (upToBottom) {
                    upToBottom = false;
                    rightToLeft = true;

                } else if (bottomToUp) {
                    bottomToUp = false;
                    leftToRight = true;

                }
            } else {
                if ((i == 0 && bottomToUp) || (j == 0 && rightToLeft) || (i == n - 1 && upToBottom)
                        || (j == m - 1 && leftToRight)) {
                    System.out.println(i);
                    System.out.println(j);
                    break;
                }
            }
        }
        scn.close();
    }
}

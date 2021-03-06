package problems;

import java.io.*;
import java.util.*;

public class MaxGold {

    public static void main(String[] args) throws Exception {

        File file = new File("./input.txt");
        Scanner scn = new Scanner(file);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int dp[][] = new int[n][m];

        for (int col = arr[0].length - 1; col >= 0; col--) {
            for (int row = arr.length - 1; row >= 0; row--) {
                if (col == arr[0].length - 1) {
                    dp[row][col] = arr[row][col];
                } else if (row == 0) {
                    dp[row][col] = arr[row][col] + Math.max(dp[row][col + 1], dp[row + 1][col + 1]);
                } else if (row == arr.length - 1) {
                    dp[row][col] = arr[row][col] + Math.max(dp[row][col + 1], dp[row - 1][col + 1]);
                } else {
                    dp[row][col] = arr[row][col]
                            + Math.max(dp[row][col + 1], Math.max(dp[row - 1][col + 1], dp[row + 1][col + 1]));
                }

            }
        }
        int max = dp[0][0];
        for (int i = 1; i < dp.length; i++) {
            if (max < dp[i][0]) {
                max = dp[i][0];
            }
        }
        System.out.println(max);
    }

}

package problems;

import java.io.*;
import java.util.*;

public class PrintKnightsTour {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = scn.nextInt();
        int col = scn.nextInt();
        int arr[][] = new int[n][n];
        printKnightsTour(arr, row, col, 0);

    }
    // static int count=0;

    public static void printKnightsTour(int[][] chess, int row, int col, int count) {
        if (count == 25) {
            displayBoard(chess);
            return;
        }
        if (row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0) {
            return;
        }
        count++;
        chess[row][col] = count;
        printKnightsTour(chess, row - 2, col + 1, count);
        printKnightsTour(chess, row - 1, col + 2, count);
        printKnightsTour(chess, row + 1, col + 2, count);
        printKnightsTour(chess, row + 2, col + 1, count);
        printKnightsTour(chess, row + 2, col - 1, count);
        printKnightsTour(chess, row + 1, col - 2, count);
        printKnightsTour(chess, row - 1, col - 2, count);
        printKnightsTour(chess, row - 2, col - 1, count);
        chess[row][col] = 0;

    }

    public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

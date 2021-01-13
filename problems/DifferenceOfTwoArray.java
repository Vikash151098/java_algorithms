package problems;

import java.util.*;

public class DifferenceOfTwoArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }
        int max = n1 > n2 ? n1 : n2;
        int result[] = new int[max];
        int i = n1 - 1, j = n2 - 1, borrow = 0;
        while (i >= 0 || j >= 0) {
            int diff = (j >= 0 ? arr2[j] : 0) - (i >= 0 ? arr1[i] : 0) - borrow;
            if (diff < 0) {
                result[max - 1] = 10 + diff;
                borrow = 1;
            } else {
                result[max - 1] = diff;
                borrow = 0;
            }
            i--;
            j--;
            max--;
        }

        for (int a = 0; a < result.length; a++) {
            if (a == 0 && result[a] <= 0) {
                continue;
            }
            System.out.println(result[a]);
        }
        scn.close();
    }

}
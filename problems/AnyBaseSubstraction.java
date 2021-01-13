package problems;

import java.util.*;

public class AnyBaseSubstraction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getDifference(int b, int n1, int n2) {
        int borrow = 0, result = 0, mul = 1;
        while (n1 > 0 || n2 > 0) {
            int diff = (n2 % 10) - borrow - (n1 % 10);
            if (diff < 0) {
                result = result + (b + diff) * mul;
                borrow = 1;
            } else {
                result = result + (diff) * mul;
                borrow = 0;
            }
            n1 = n1 / 10;
            n2 = n2 / 10;
            mul = mul * 10;
        }
        return result;
    }

}
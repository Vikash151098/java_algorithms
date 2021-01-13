package problems;

import java.util.*;

class AnyBaseAddition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getSum(int b, int n1, int n2) {

        int result = 0, mul = 1, carry = 0;
        while (n1 > 0 || n2 > 0) {
            int sum = carry + (n1 % 10) + (n2 % 10);
            result = result + (sum % b) * mul;
            carry = sum / b;
            n1 = n1 / 10;
            n2 = n2 / 10;
            mul = mul * 10;
        }
        result = result + carry * mul;
        return result;
    }

}
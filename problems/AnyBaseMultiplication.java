package problems;

import java.util.*;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getProduct(int b, int n1, int n2) {
        int result = 0, mul2 = 1;
        while (n2 > 0) {
            int carry = 0;
            int a = n2 % 10, number = 0, mul = 1;
            int first = n1;
            while (first > 0) {
                int m = a * (first % 10) + carry;
                carry = m / b;
                number = number + (m % b) * mul;
                first = first / 10;
                mul = mul * 10;
            }
            number = number + (carry % b) * mul;
            if (carry / b > 0) {
                number = number + (carry % b) * mul;
            }
            result = getSum(b, result, number * mul2);
            n2 = n2 / 10;
            mul2 = mul2 * 10;
        }

        return result;

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

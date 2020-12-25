package problems;

public class factorial {
    public static int fac(int n) {
        if (n <= 1)
            return 1;

        return (n * fac(n - 1));
    }

    public static void main(String[] args) {
        int n = 10;
        int factorial = fac(n);
        System.out.println(factorial);
    }

}

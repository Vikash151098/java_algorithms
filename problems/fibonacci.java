package problems;

class fibonacci {

    static int fib(int n) throws Exception {
        if (n < 1)
            throw new Exception("0 position of fibonacci series is not possible");
        else if (n <= 2)
            return n - 1;
        else
            return fib(n - 1) + fib(n - 2); // O(2^N)
    }

    public static void main(String[] arg) throws Exception {
        int n = 0;
        int fibonacci = fib(n);
        System.out.println(fibonacci);
    }
}
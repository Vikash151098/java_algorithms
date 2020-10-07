class fabnacci {

    static int fab(int n) {
        if (n <= 1)
            return n;

        return fab(n - 1) + fab(n - 2); // O(2^N)
    }

    public static void main(String[] arg) {
        int n = 20;
        for (int i = 0; i < n; i++) {
            System.out.print(Character.toChars(fab(i)));

        }
        System.out.println();
    }
}
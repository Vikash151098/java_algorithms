class fabnacci {

    static int fab(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fab(n - 1) + fab(n - 2);
    }

    public static void main(String[] arg) {

    }
}
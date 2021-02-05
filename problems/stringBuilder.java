package problems;

public class stringBuilder {

    public static void main(String[] args) {
        // int n = 1000;
        // String s = "";
        // long start = System.currentTimeMillis();
        // for (int i = 0; i < n; i++) {
        // s += i;
        // }
        // long end = System.currentTimeMillis();
        // System.out.println(end - start);
        StringBuilder sb = new StringBuilder("hello");
        char ch = sb.charAt(2);
        System.out.println(ch);

        sb.setCharAt(2, 'y');
        System.out.println(sb);
    }
}
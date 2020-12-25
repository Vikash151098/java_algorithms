package basic_programming;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        // System.out.print("enter your age: ");
        // int age = s.nextInt();
        // s.nextLine();
        // System.out.print("enter your name: ");
        // String str = s.nextLine();
        // System.out.println("Your age is " + age);
        // System.out.println("Your name is " + str);
        int num = 4280;
        int number = 0;
        String str = Integer.toString(num);
        int b = str.charAt(str.length() - 1) - '0';
        for (int i = str.length() - 1; i >= 0; i--) {
            int a = str.charAt(i) - '0';
            number = number * 10 + a;
        }
        System.out.println(number);
        System.out.println(b);
        s.close();
    }
}

package basic_programming;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("enter your age: ");
        int age = s.nextInt();
        s.nextLine();
        System.out.print("enter your name: ");
        String str = s.nextLine();
        System.out.println("Your age is " + age);
        System.out.println("Your name is " + str);

    }
}

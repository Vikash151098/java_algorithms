package basic_programming;

import java.util.Scanner;

public class basicinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("age " + age);
        System.out.println("name " + name);
        sc.close();
    }
}

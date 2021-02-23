package core_java;

import java.util.Scanner;

public class input_from_console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println();
        System.out.println("Your Name is : " + name);
        sc.close();
    }
}

import java.io.File;
import java.util.Scanner;

class New {
    public static void main(String[] arg) throws Exception {
        File f = new File("./input.txt");
        Scanner s = new Scanner(f);
        // System.out.println("Enter your Name");
        String name = s.nextLine();
        // System.out.println("--------------------------------------------------------------------------------------");
        // System.out.println("Enter your Age");
        int age = s.nextInt();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Your Details : ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("--------------------------------------------------------------------------------------");
        s.close();
    }
}
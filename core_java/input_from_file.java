package core_java;

import java.util.Scanner;
import java.io.File;

public class input_from_file {
    public static void main(String[] args) throws Exception {
        try {

            File file = new File("./input.txt");
            Scanner sc = new Scanner(file);
            File outputFile = new File("output.txt");
            if (outputFile.createNewFile()) {
                System.out.println("output file created successfully " + outputFile.getName());
            } else {
                System.out.println("File already exists.");
            }
            while (sc.hasNext()) {
                String name = sc.nextLine();
                System.out.println("Your Name is : " + name);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

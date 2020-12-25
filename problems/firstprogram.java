package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firstprogram {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        String ar[] = new String[n];
        for (int i = 0; i < n; i++) {
            ar[i] = br.readLine();
        }
        printOutput(ar);
    }

    static void printOutput(String[] str) {
        for (int i = 0; i < str.length; i++) {
            String st[] = str[i].split(",");
            int row = Integer.parseInt(st[0]);
            int column = Integer.parseInt(st[1]);
            int count = 1;
            System.out.print("[");
            for (int p = 0; p < row; p++) {
                if (p != 0) {
                    System.out.print(",");
                }
                System.out.print("[");
                for (int q = 0; q < column; q++) {
                    if (q != 0) {
                        System.out.print(",");
                    }
                    System.out.print(count);
                    count++;
                }
                System.out.print("]");
            }
            System.out.println("]");
        }
    }
}
package problems;

import java.io.*;
import java.util.*;

public class getStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> result = getStairPaths(n);
        System.out.println(result);

    }

    public static ArrayList<String> getStairPaths(int n) {
        ArrayList<String> result = new ArrayList<>();
        if (n == 0) {
            result.add("");
            return result;
        }
        if (n <= 3) {
            for (int i = 1; i <= n; i++) {
                ArrayList<String> ror = getStairPaths(n - i);
                for (String s : ror) {
                    result.add(i + s);
                }
            }

            return result;
        }
        for (int i = 1; i <= 3; i++) {
            ArrayList<String> ror = getStairPaths(n - i);
            for (String s : ror) {
                result.add(i + s);
            }
        }
        return result;
    }

}
package problems;

import java.io.*;
import java.util.*;

public class getMazePath {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> result = getMazePaths(1, 1, n, m);
        System.out.println(result);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        ArrayList<String> result = new ArrayList<>();
        if (sr == dr && sc == dc) {
            result.add("");
            return result;
        }

        // for horizontal
        if (sc < dc) {
            ArrayList<String> rorh = getMazePaths(sr, sc + 1, dr, dc);
            for (String s : rorh) {
                result.add("h" + s);
            }
        }

        // for vartical
        if (sr < dr) {
            ArrayList<String> rorv = getMazePaths(sr + 1, sc, dr, dc);
            for (String s : rorv) {
                result.add("v" + s);
            }
        }

        return result;

    }
}

package problems;

import java.io.*;
import java.util.*;

public class getMazePathWithJump {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> res = getMazePaths(1, 1, n, m);
        System.out.println(res);

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
            // for jump
            for (int i = 1; i <= dc - sc; i++) {
                ArrayList<String> rorh = getMazePaths(sr, sc + i, dr, dc);
                for (String s : rorh) {
                    result.add("h" + i + s);
                }

            }
        }

        // for verticals
        if (sr < dr) {
            // for jump
            for (int i = 1; i <= dr - sr; i++) {
                ArrayList<String> rorv = getMazePaths(sr + i, sc, dr, dc);
                for (String s : rorv) {
                    result.add("v" + i + s);
                }

            }
        }

        // for diogonal
        int col = dc - sc;
        int row = dr - sr;
        if ((row >= col || col >= row) && dc - sc > 0) {
            // for jump
            for (int i = 1; i <= dc - sc; i++) {
                ArrayList<String> rord = getMazePaths(sr + i, sc + i, dr, dc);
                for (String s : rord) {
                    result.add("d" + i + s);
                }
            }
        }
        return result;
    }

}

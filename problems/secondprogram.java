package problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class secondprogram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ar[] = new String[5];
        for (int i = 0; i < 5; i++) {
            ar[i] = br.readLine();
        }

        printResult(ar);

    }

    static void printResult(String[] str) {
        for (int i = 0; i < 5; i++) {
            String[] data = str[i].split(" ");
            HashSet<Integer> result = new HashSet<Integer>();
            for (int p = 0; p < data.length; p++) {
                result.add(Integer.parseInt(data[p]));
            }
            List<Integer> list = new ArrayList<Integer>(result);
            Collections.sort(list);
            for (Integer s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

}

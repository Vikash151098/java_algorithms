package problems;

public class SingleValueData {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 2, 4, 5, 6, 6, 5, 8 };
        int counter[] = new int[a.length];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    counter[i]++;
                    counter[j]++;
                }
            }
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 1)
                System.out.println(a[i]);
        }

    }
}

package algorithm.sorting;

public class InsertitionSort {
    public static void main(String[] args) {
        int arr[] = { 9, 7, 2, 4, 1, 8, 3, 1 };
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int a : arr) {
            System.out.println(a);
        }
    }
}

package algorithm.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 7, 4, 3, 6, 8, 2, 5, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    System.out.println("swap");
                }
            }
        }

        for (int a : arr) {
            System.out.println(a);
        }
    }
}

package algorithm.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7, 1 };
        int mi = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[mi] > arr[j]) {
                    mi = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[mi];
            arr[mi] = temp;
        }

        for(int a:arr)
        {
            System.out.println(a);
        }
    }
}

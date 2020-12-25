package data_structure.array;

public class SingleDimentionArray {
    int arr[] = null;

    public SingleDimentionArray(int arraySize) {
        arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
        System.out.println("Array Initialised Successfully");
    }

    void traverse() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array Value at " + i + " is :" + arr[i]);
        }
    }

    void Insert(int dataToInsert, int location) {
        if (arr[location] == Integer.MIN_VALUE) {
            arr[location] = dataToInsert;
            System.out.println(dataToInsert + " Inserted value at " + location);
        } else {
            System.out.println("Already Inserted value at " + location);
        }
    }

}

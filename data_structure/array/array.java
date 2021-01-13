package data_structure.array;

/**
 * array
 */
public class array {

    public static void main(String[] args) {
        SingleDimentionArray arr = new SingleDimentionArray(10);
        try {
            // arr.traverse();
            arr.Insert(10, 1);
            arr.Insert(15, 2);
            System.out.println();
            System.out.println();
            arr.traverse();
        } catch (Exception e) {
            System.out.println("error :" + e);
        }

    }
}


package basic_programming;

/**
 * increment
 */
public class increment {

    public static void main(String[] args) {
        int i = 10;
        int a = ++i;
        System.out.println("a is " + a + " and i is" + i);
        int b = i;
        System.out.println("b is " + b);

        System.out.println("result is " + (a == b));
    }
}
package oops;

public class StaticVar {
    static int count = 0;
    static int age;
    static String name;

    // This is a Static Method
    static void disp() {
        System.out.println("Age is: " + age);
        System.out.println("Name is: " + name);
    }

    void increment() {
        count++;
    }

    public static void main(String[] args) {
        StaticVar sv1 = new StaticVar();
        StaticVar sv2 = new StaticVar();
        sv1.increment();
        sv2.increment();
        System.out.println("obj1 count is: " + sv1.count);
        System.out.println("obj2 count is: " + sv2.count);

        age = 30;
        name = "Arya";
        disp();

    }
}

package oops;

public class Father {
    long money = 1000000L;
    private String girlFriend = "Katrina";

    void doYoga() {
        smoke();
        System.out.println("yoga");
    }

    private void smoke() {
        System.out.println("Smoke");
    }
}

class Son extends Father {
    public static void main(String[] args) {
        Son s = new Son();
        s.doYoga();
        // s.smoke(); // The method smoke() from the type Father is not visible
    }
}

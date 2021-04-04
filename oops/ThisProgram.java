package oops;

/*
this is the program about this keyword
*/
public class ThisProgram {
    String name="vikash kumar";
    void MakeNoise() {
        this.displayName();
        System.out.println(this);
    }
    void displayName()
    {
        System.out.println("name is "+this.name);
    }

    public static void main(String[] args) {
        ThisProgram tp = new ThisProgram();
        System.out.println(tp);
        tp.MakeNoise();
    }
}

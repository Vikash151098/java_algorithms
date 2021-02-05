package causal_program;

public class stringProgram {

    public static void main(String[] args) {
        String st = "abcd";
        System.out.println("[");
        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j <= st.length(); j++) {
                System.out.println("[" + st.substring(i, j) + "]");

            }
        }
        System.out.println("]");

    }
}

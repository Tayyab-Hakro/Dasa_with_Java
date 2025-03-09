public class Dsa {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        a = a + b; // a becomes 11
        b = a - b; // b becomes 5
        a = a - b; // a becomes 6

        System.out.println("a: " + a); // 6
        System.out.println("b: " + b); // 5
    }
}

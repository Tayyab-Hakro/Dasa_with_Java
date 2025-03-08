import java.util.*;
public class Dsa {
    public static void main(String[] args) {
        LinkedList <String> Str = new LinkedList<String>();

        Str.addFirst("This");
        Str.addFirst("is");
        Str.addFirst("a");
        Str.addFirst("Book");
        Str.removeLast();

        System.out.println(Str);
    }
}

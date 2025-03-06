import java.util.Scanner;

public class Dsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();  // Get input from user
        
        // Loop from 1 to 10 for the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();  // Close scanner to avoid resource leak
    }
}

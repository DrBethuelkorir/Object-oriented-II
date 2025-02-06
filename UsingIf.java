import java.util.Scanner;

public class UsingIf { // Class name should follow Java's convention (camel case, starting with uppercase)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Better naming for the Scanner object
        
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        
        if (age >= 18 && age <= 100) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }
        
        scanner.close(); // Close the scanner to avoid resource leak
    }
}

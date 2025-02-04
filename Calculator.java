import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner one  = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter the first number: ");
        double num1 = one.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = one.nextDouble();

        // Displaying options for the operation
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Reading the choice
        int choice = one.nextInt();

        // Performing the operation using switch statement
        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                break;
        }

    
    }
}

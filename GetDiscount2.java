import java.util.Scanner;

public class GetDiscount2 {
    public static double mymethod(int amount) {
        double discount = 0.0;
        
        if (amount > 5000) {
            discount = amount * 0.10; // 10% discount
        } else if (amount > 1000 && amount <= 5000) {
            discount = amount * 0.05; // 5% discount
        }
        // No discount is applied if amount <= 1000, so discount remains 0
        return discount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt(); // Read the input value from user

        double discount = mymethod(amount); // Call the method to calculate discount
        System.out.println("Discount: " + discount); // Display the discount

        scanner.close(); // Close the scanner object to prevent resource leak
    }
}

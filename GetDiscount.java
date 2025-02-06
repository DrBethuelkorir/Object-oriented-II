public class GetDiscount {
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
        double discount; // Use double for decimal values
        discount = mymethod(700);
        System.out.println(discount); // Prints the discount

        discount = mymethod(2000);
        System.out.println(discount); // Prints the discount
    }
}

import java.util.Scanner;

public class ShoppingBillWithVAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double subtotal = price * quantity;
        double vat = subtotal * 0.12;
        double total = subtotal + vat;

        System.out.println("Subtotal: PHP " + subtotal + "; VAT: PHP " + vat + "; Total: PHP " + total);

        sc.close();
    }
}
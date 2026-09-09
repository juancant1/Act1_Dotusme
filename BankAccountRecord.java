import java.util.Scanner;

public class BankAccountRecord
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter account type: ");
        String accountType = sc.nextLine();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.println("Holder: " + accountHolder + "; Account Number: " + accountNumber + "; Type: " + accountType + "; Balance: PHP " + balance);
        sc.close();
    }
}
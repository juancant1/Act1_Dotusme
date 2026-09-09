import java.util.Scanner;

public class OnlineGamePlayer 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter character name: ");
        String characterName = sc.nextLine();

        System.out.print("Enter level: ");
        int level = sc.nextInt();

        System.out.print("Enter experience points: ");
        long exp = sc.nextLong();

        sc.nextLine(); // Clears the leftover newline character from the buffer

        System.out.print("Enter rank: ");
        String rank = sc.nextLine();

        System.out.println("Username: " + username + "; Character: " + characterName + "; Level: " + level + "; EXP: " + exp + "; Rank: " + rank);
    }
}
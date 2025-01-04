import java.util.Scanner;

public class App {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pemilihan karakter pemain
        System.out.println("Welcome to the game!");
        System.out.println("Choose your character:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter your character's name: ");
        String playerName = scanner.nextLine();

        GameCharacter player;
        switch (choice) {
            case 1 -> player = new Warrior(playerName);
            case 2 -> player = new Mage(playerName);
            case 3 -> player = new Archer(playerName);
            default -> {
                System.out.println("Invalid choice. Defaulting to Warrior.");
                player = new Warrior(playerName);
            }
        }

        // Musuh
        GameCharacter enemy = new Warrior("Enemy Warrior");

        // Game loop
        System.out.println("\nThe battle begins!");
        while (player.isAlive() && enemy.isAlive()) {
            // Tampilkan status
            System.out.println("\nYour status:");
            player.showStatus();
            System.out.println("\nEnemy status:");
            enemy.showStatus();

            // Pemain menyerang
            System.out.println("\nYour turn!");
            player.attack(enemy);
            if (!enemy.isAlive()) break;

            // Musuh menyerang
            System.out.println("\nEnemy's turn!");
            enemy.attack(player);
        }

        // Menentukan pemenang
        if (player.isAlive()) {
            System.out.println("\nCongratulations, " + player.name + " wins!");
        } else {
            System.out.println("\n" + player.name + " has been defeated. Better luck next time!");
        }

        scanner.close();
    }
}

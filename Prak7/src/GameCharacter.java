abstract class GameCharacter {
    protected String name;
    protected int health;

    // Constructor
    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Abstract method
    public abstract void attack(GameCharacter target);

    // Method untuk menampilkan status karakter
    public void showStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }

    // Method untuk menerima damage
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage!");
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }

    public boolean isAlive() {
        return health > 0;
    }
}
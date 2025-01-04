class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name, 100);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + " swings a sword at " + target.name + "!");
        target.takeDamage(15);
    }
}

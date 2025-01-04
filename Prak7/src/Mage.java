class Mage extends GameCharacter {
    public Mage(String name) {
        super(name, 80);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + " casts a fireball at " + target.name + "!");
        target.takeDamage(20);
    }
}
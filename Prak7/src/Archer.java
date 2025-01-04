class Archer extends GameCharacter {
    public Archer(String name) {
        super(name, 90);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + " shoots an arrow at " + target.name + "!");
        target.takeDamage(10);
    }
}

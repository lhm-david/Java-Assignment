public class Human {
    protected String name;
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;

    public Human(String name) {
        this.name = name;
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public String getName() {
        return this.name;
    }
    public void attack(Human otherHuman) {
        otherHuman.health = otherHuman.health - this.strength;
        System.out.println(otherHuman.getName() + " just got attacked by " + this.name + ", his health is " + otherHuman.health);
    }
}
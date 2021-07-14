public class Human {
    public String name;
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    public int health = 100;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void attack(Human otherHuman) {
        otherHuman.health = otherHuman.health - this.strength;
        System.out.println(otherHuman.getName() + " just got attacked by " + this.name + ", his health is " + otherHuman.health);
    }
}
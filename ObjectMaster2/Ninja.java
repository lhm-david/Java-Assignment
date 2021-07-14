public class Ninja extends Human{
    
    public Ninja(String name) {
        super(name);
        this.stealth = 10;
    }

    public String getName() {
        return this.name;
    }

    public void steal(Human otherHuman) {
        otherHuman.health = otherHuman.health - this.stealth;
        this.health = this.health + this.stealth;
        System.out.println(otherHuman.name + " was steal " + this.stealth + " by " + this.name);
    }

    public void runAway() {
        this.health = this.health - 10;
        System.out.println("The Ninja " + this.name + "has run away and his health is " + this.health);
    }
}

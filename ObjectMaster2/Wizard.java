public class Wizard extends Human{
    
    public Wizard(String name) {
        super(name);
        this.health = 50;
        this.intelligence = 8;
    }

    public String getName() {
        return this.name;
    }

    public void heal(Human otherHuman) {
        otherHuman.health = otherHuman.health + this.intelligence;
        System.out.println("The Wizard " + this.name + "has heal " + otherHuman.getName() + " " + this.intelligence);
    }

    public void fireball(Human otherHuman) {
        otherHuman.health = otherHuman.health - this.intelligence*3;
        System.out.println("The Wizard " + this.name + "fires a fireball to " + otherHuman.getName() + ", and cause " + this.intelligence);
    }

}

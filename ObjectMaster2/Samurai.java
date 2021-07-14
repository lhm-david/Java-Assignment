public class Samurai extends Human {
    static int numberOfSamurai;

    public Samurai(String name) {
        super(name);
        this.health = 200;
        numberOfSamurai++;
    }
    
    public void deathBlow(Human otherHuman) {
        otherHuman.health = 0;
        this.health = 100;
        System.out.println(this.name +"was death by the deathblow from " + otherHuman.name);
    }

    public void mediate() {
        this.health = this.health + this.health*(1/2);
        System.out.println("This " + this.name + "'s current health is " + this. health);
    }

    public static void howMany() {
        System.out.println(numberOfSamurai); 
    }
}

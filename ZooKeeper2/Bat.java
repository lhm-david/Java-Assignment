public class Bat {

  private int energyLevel = 300;

  public void fly() {
    this.energyLevel = energyLevel - 50;
    System.out.println("The Giant Bat is flying.");
  }

  public void eatHumans() {
    this.energyLevel = energyLevel + 25;
    System.out.println("The Giant Bat is eating Humans.");
  }

  public void attackTown() {
    this.energyLevel = energyLevel - 100;
    System.out.println("The Giant Bat is attacking Towns.");
  }

  public void displayEnergy() {
    System.out.println("This Bat's energy level is " + this.energyLevel);
  }
}

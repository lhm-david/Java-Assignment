public class Gorilla extends Mammal {

  public int throwSeomthing() {
    this.energyLevel = energyLevel - 5;
    System.out.println("this Gorilla throw something to his audience.");
    return displayEnergy();
  }

  public int eatBananas() {
    this.energyLevel = energyLevel + 10;
    System.out.println("this Gorilla is eating a banana.");
    return displayEnergy();
  }

  public int climb() {
    this.energyLevel = energyLevel - 10;
    System.out.println("this Gorilla is climbing a tree");
    return displayEnergy();
  }
}

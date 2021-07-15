public class PhoneTester {
    public static void main(String[] args) {
      Galaxy s9 = new Galaxy("S9", 99, "T-Mobile", "RING RING");
      iPhone iPhone10 = new iPhone("X", 100, "ATT", "Zzz zzz zzz");
      s9.displayInfo();
      System.out.println(s9.Ring());
      System.out.println(s9.unlock());
      iPhone10.displayInfo();
      System.out.println(iPhone10.Ring());
      System.out.println(iPhone10.unlock());
    }
  }
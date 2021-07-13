
// import java.util.Date;
// import java.lang;
public class PythagoreanTheorem {
    public double calculateHypotenuse(int legA, int legB) {
        double C = Math.pow (legA, 2) + Math.pow (legB, 2);
        double squareRoot = Math.sqrt(C);
        return squareRoot;
    }
}

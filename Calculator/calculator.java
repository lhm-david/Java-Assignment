public class calculator implements java.io.Serializable {
    private double Operandone;
    private double Operandtwo;

    public calculator(
        double Operandone,
        double Operandtwo
    ) {
        this.Operandone = Operandone;
        this.Operandtwo = Operandtwo;
    }

    public double getAdding() {
        return this.Operandone + this.Operandtwo;
    }

    public double getSubtracting() {
        return this.Operandone - this.Operandtwo;
    }

    public void performOperation() {
        System.out.println(this.Operandone + " + " + this.Operandtwo);
    }

    public void getResults() {
        System.out.println(getAdding());
    }
}
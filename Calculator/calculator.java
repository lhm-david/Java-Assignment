public class calculator {

  private double Operandone;
  private double Operandtwo;
  private double result;
  private char operator;

  public calculator() {
  }

  public void setOperandone(double Operandone) {
      this.Operandone = Operandone;
  }

  public void setOperandtwo(double Operandtwo) {
      this.Operandtwo = Operandtwo;
  }

  public void setOperator(char operator) {
      this.operator = operator;
  }
  
  public void performOperation() {
      if (this.operator == '+') {
          this.result = Operandone + Operandtwo;
      }
      if (this.operator == '-') {
          this.result = Operandone - Operandtwo;
      }
  }

  public void getResults() {
    System.out.println(result);
  }
}

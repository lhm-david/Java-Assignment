public class calculatorTest {
    public static void main(String[] args){
        calculator newoperation = new calculator();
        newoperation.setOperandone(10.5);
        newoperation.setOperandtwo(5.2);
        newoperation.setOperator('+');
        newoperation.performOperation();
        newoperation.getResults();
    }
}

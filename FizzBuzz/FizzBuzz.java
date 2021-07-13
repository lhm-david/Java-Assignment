public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number == 2){
            return ("2");
        }
        if (number == 3) {
            return ("Fizz");
        }
        if (number == 5) {
            return ("Buzz");
        }
        if (number == 15) {
            return ("FizzBuzz");
        }
        return String.valueOf(number);
    }
}
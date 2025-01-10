package exceptions;


public class Arithmetic {

    public static int divide(int numerator, int denominator) {
        if(denominator == 0){
            throw new RuntimeException("Division by zero");
        }
        return numerator / denominator;
    }
}

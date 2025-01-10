package exceptions;

import java.lang.Exception;

public class TestArithmetic {
    public static void main(String[] args) {

        try {
            var total = Arithmetic.divide(10, 2);
            System.out.println(total);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Division done");
        }

    }
}

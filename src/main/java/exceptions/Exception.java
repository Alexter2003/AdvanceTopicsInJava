package exceptions;

public class Exception {
    public static void main(String[] args) {
        int value = 10;
        int value2 = 0;

        try {
            var total = value / value2;
            System.out.println(total);
        } catch (java.lang.Exception e) {
            System.out.println(e);
        }
    }
}

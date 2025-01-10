package variable_arguments;

public class VariableArguments {
    public static void main(String[] args) {
        printNumbers(1,2,3,4);
        showParameters("Alex", 10, 20, 30);
    }
    //varargs
    static void printNumbers(int... numbers){
        for (int number : numbers){
            System.out.println(number);
        }
    }

    //varargs with different types
    static void showParameters(String name, int... numbers){
        System.out.println("name: " + name);
        for (int number : numbers){
            System.out.println( number);
        }
    }

}


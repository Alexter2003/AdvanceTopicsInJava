package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lists {
    public static void main(String[] args) {
        //generic types <t>
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        for(String element:list){
            System.out.println(element);
        }
        //Lambda functions (anonymous functions with very compact code)
        System.out.println("\nLambda function");
        list.forEach( element -> {
            System.out.println("Element: " + element);
        });

        //Reference methods
        System.out.println("\nReference method");
        list.forEach(System.out::println);

        //other way to create lists
        List<String> names =  Arrays.asList("Perdo", "Miguel", "Alexander");
        System.out.println("\nNames with reference method");
        names.forEach(System.out::println);
    }
}

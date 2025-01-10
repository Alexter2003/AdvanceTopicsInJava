package list;

import java.util.ArrayList;
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
        System.out.println("Lambda function");
        list.forEach( element -> {
            System.out.println("Element: " + element);
        });
    }
}

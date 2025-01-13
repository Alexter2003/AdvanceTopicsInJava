package Maps;

import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();
        person.put("name", "Alexander");
        person.put("lastName", "Vasquez");
        person.put("age", "21");

        System.out.println("Values of map: ");
        person.entrySet().forEach(System.out::println);

        System.out.println("\n Iterating over elements (key, value)");
        //With lambda function (like a arrow functions in js)
        person.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}

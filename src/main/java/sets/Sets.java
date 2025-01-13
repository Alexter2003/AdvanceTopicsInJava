package sets;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("a");
        //Elements cannot be duplicate in sets
        set.add("a");
        set.add("b");
        set.add("c");

        System.out.println("Elements of set: ");
        set.forEach(System.out::println);

        //Remove element
        set.remove("c");

        System.out.println("Elements of set: ");
        set.forEach(System.out::println);
    }
}

package java_beans;

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alex");
        person.setAge(21);
        System.out.println("Person: " + person);
    }
}

//JavaBeans
//implenets Serializable interface
class Person implements Serializable {
    //encapsulation
    private String name;
    private int age;

    //empty constructor
    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

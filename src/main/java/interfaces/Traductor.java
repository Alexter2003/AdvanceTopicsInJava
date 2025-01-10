package interfaces;

public interface Traductor {
    //all methods in the interface are public and abstract
    void translate();

    //Methods with default implementation
    default void startTraductor() {
        System.out.println("Start Traductor");
    }
}

package interfaces;

public class Test {
    public static void main(String[] args) {
        Traductor traductor = new English();
        traductor.startTraductor();
        traductor.translate();

        traductor = new Spanish();
        traductor.startTraductor();
        traductor.translate();
    }
}

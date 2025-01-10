package abstract_classes;

public class GeometricFigure {
    public static void main(String[] args) {
        //Figure figure = new Fiugre() //ERROR
        Figure circle = new Circle();
        Figure rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}

//can't instantiate the abstract classes
abstract class Figure {
    public abstract void draw();
}

class Circle extends Figure {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Rectangle extends Figure {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

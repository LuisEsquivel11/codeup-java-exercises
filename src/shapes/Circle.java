package shapes;

import util.Input;

public class Circle {

    final static double PI = Math.PI;
    Input input = new Input();
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return PI * radius;
    }
    public double getCircumference() {
        return (2 * PI * radius);
    }

}

package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Measurable myShape = new Rectangle(5, 5);
        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }
}

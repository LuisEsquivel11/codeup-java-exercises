package shapes;

public class Square extends Rectangle{




        public Square(double side) {
            super.length = side;
            super.width = side;
        }

        public double getArea() {
            return Square.super.length * Square.super.length;
        }

        public double getPerimeter() {
            return 4 * Square.super.length;
        }

}

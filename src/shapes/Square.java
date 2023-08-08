package shapes;

public class Square extends Quadrilateral implements Measurable{

        protected double side;

    public Square( int side) {
        super(side, side);
//        this.side = side;
    }

//    public double getSide() {
//        return side;
//    }
//
//    public void setSide(int side) {
//        this.side = side;
//    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;

    }
    public void setWidth(double width) {
        this.side = width;
    }
    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }
}

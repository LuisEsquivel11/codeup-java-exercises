package shapes;

import util.Input;

import java.util.Scanner;


public class CircleApp {

    public static void main(String[] args) {
        System.out.println(createCircle());


    }

       public static Circle createCircle()   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of your circle");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("The circumference is: " + circle.getCircumference());
        System.out.println("The area is: " + circle.getArea());
        return circle;

       }
}

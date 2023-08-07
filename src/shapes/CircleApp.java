package shapes;

import util.Input;

import java.util.Scanner;


public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        do {
            System.out.println("Enter the radius of your circle");
            double radius = input.getDouble();
            Circle circle = new Circle(radius);

            System.out.printf("The circumference is: %.2f ", circle.getCircumference());
            System.out.printf("The area is: %.2f ", circle.getArea());
            System.out.println("\nWould you like to make a new circle?");
        } while (input.yesNo());


    }

//       public static Circle createCircle()   {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the radius of your circle");
//        double radius = scanner.nextDouble();
//        Circle circle = new Circle(radius);
//        System.out.println("The circumference is: " + circle.getCircumference());
//        System.out.println("The area is: " + circle.getArea());
//        return circle;
//
//       }
}

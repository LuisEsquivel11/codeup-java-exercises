import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;

        System.out.println("The value of pi is approximately " + String.format("%.2f", pi));
//
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter an integer");
//        int userNumber = scanner.nextInt();
//        System.out.println("The number you entered is: " + userNumber);
//
//        // next() method
//        System.out.println("Enter 3 words");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.println("The first word is: " + firstWord);
//        System.out.println("The second word is: " + secondWord);
//        System.out.println("The third word is: " + thirdWord);
//
//        //nextLine() method
//        System.out.println("Enter a sentence");
//        String sentence = scanner.nextLine();
//        System.out.println("The three words are: " + scanner.nextLine());

//        System.out.println("Enter the width of your Classroom in feet");
//        String widthString = scanner.nextLine();
//        int width = Integer.parseInt(widthString);
//        System.out.println("Now enter the length");
//        String lengthString = scanner.nextLine();
//        int length = Integer.parseInt(lengthString);
//        System.out.println("The area of your Classroom is: " + (width * length) + "ft, and the perimeter is " + ((width * 2) + (length * 2)) + "sq/ft.");

        Scanner otherScanner = new Scanner(System.in);
        otherScanner.useDelimiter("\n");

        System.out.format("Enter the width, length and height of your Classroom in feet: %n");
        String widthString = otherScanner.next();
        double width = Float.parseFloat(widthString);
//        System.out.println("Now enter the length");
        String lengthString = otherScanner.next();
        double length = Float.parseFloat(lengthString);
//        System.out.println("And the height");
        String heightString = otherScanner.next();
        double height = Float.parseFloat(heightString);

        double area = width * height;
        double perimeter = (width * 2) + (height * 2);
        double volume = width * length * height;

        System.out.format("The area of your Classroom is: %.2f ft, the perimeter is: %.2f sq/ft, and the volume is : %.2f cu/ft ", area, perimeter, volume );




    }
}

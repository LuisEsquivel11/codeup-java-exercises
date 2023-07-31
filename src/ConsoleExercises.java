import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;

        System.out.println("The value of pi is approximately " + String.format("%.2f", pi));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer");
        int userNumber = scanner.nextInt();
        System.out.println("The number you entered is: " + userNumber);

        // next() method
        System.out.println("Enter 3 words");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println("The first word is: " + firstWord);
        System.out.println("The second word is: " + secondWord);
        System.out.println("The third word is: " + thirdWord);

        //nextLine() method
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        System.out.println("The three words are: " + scanner.nextLine());

        System.out.println("Enter the width of your Classroom in feet");
        String widthString = scanner.nextLine();
        int width = Integer.parseInt(widthString);
        System.out.println("Now enter the length");
        String lengthString = scanner.nextLine();
        int length = Integer.parseInt(lengthString);
        System.out.println("The area of your Classroom is: " + (width * length) + "ft, and the perimeter is " + ((width * 2) + (length * 2)) + "sq/ft.");





    }
}

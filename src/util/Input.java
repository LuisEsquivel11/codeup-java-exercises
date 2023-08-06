package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;


    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        return (this.scanner.nextLine().equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
        int userInput = this.scanner.nextInt();
        do {

            if (userInput >= min && userInput <= max) {
                break;

            } else {

                System.out.println("Invalid input. Please enter a valid number.");

            }
        } while (true);
        return userInput;

    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number between " + min + " and " + max);
        double userInput = this.scanner.nextDouble();
        do {

            if (userInput >= min && userInput <= max) {
                break;

            } else {

                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextInt();
            }
        } while (true);

        return userInput;
    }



}


import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
//        random(1, 20);
        guessingGame();
    }

    public static int randomNumber() {
        double rawNumber = 1 + Math.random() * 100;
        int number = (int) rawNumber;
        return number;
    }

    public static int random(int min, int max) {
        Random random = new Random();
        int rando = random.nextInt(max) + min;
        System.out.println(rando);
        return rando;

    }

    public static String validateGuess(int guess, int luckyNumb) {
        String message;
        if (guess == luckyNumb) {
            message = "GOOD GUESS!";
        } else if (guess > luckyNumb) {
            message = "LOWER";
        } else if (guess < luckyNumb) {
            message = "HIGHER";
        } else {
            message = "Invalid number";
        }
        return message;
    }

    public static String guessingGame() {
        Scanner scanner = new Scanner(System.in);
        int luckyNumb = randomNumber();
        System.out.println("Guess a number between 1 and 100");
        int userGuess = scanner.nextInt();
        String validation = validateGuess(userGuess, luckyNumb);
           int guessCounter = 0;
            do {
                guessCounter += 1;
                System.out.println("Number of guesses: " + guessCounter);
                if (validation.equalsIgnoreCase("LOWER")) {
//                System.out.println(luckyNumb);
                System.out.println(validation);
//                System.out.println("Guess again");
                userGuess = scanner.nextInt();
                validation = validateGuess(userGuess, luckyNumb);
                } else if (validation.equalsIgnoreCase("HIGHER")) {
//                    System.out.println(luckyNumb);
                    System.out.println(validation);
//                    System.out.println("Guess again");
                    userGuess = scanner.nextInt();
                    validation = validateGuess(userGuess, luckyNumb);
                } else {
                    System.out.println(luckyNumb);
                    System.out.println(validation);
                }

            } while (!validation.equalsIgnoreCase("GOOD GUESS!"));
            System.out.println(validation + " It took you " + guessCounter + " tries.");
            guessCounter = 0;
        return validation;
    }

}

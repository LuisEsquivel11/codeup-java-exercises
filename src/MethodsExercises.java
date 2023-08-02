import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        addition(1,2);
//        subtraction(100,50);
//        multiplication(5,5);
//        division(25,5);
//        modulus(100,3);
//        getInteger(1,10);
//        factorial();
//        System.out.println(generateRandomNumber());
        rollDice();
    }
    public static int addition(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
        return sum;
    }

    public static int subtraction(int num1, int num2) {
        int difference = num1 - num2;
        System.out.println(difference);
        return difference;
    }

    public static int multiplication(int num1, int num2) {
        int product = num1 * num2;
        System.out.println(product);
        return product;
    }
     public static int division(int num1, int num2) {
        int quotient = num1 / num2;
         System.out.println(quotient);
        return quotient;
     }

     public static int modulus(int num1, int num2) {
        int remainder = num1 % num2;
         System.out.println(remainder);
        return remainder;
     }

     public static int getInteger(int min, int max) {
         System.out.println("Enter a number between " + min + " and " + max);
         Scanner scanner = new Scanner(System.in);
         int userInput = scanner.nextInt();

         do {

             if (userInput >= min && userInput <= max) {
                 break;

             } else {

                 System.out.println("Invalid input. Please enter a valid number.");
                 scanner.next();
             }
         } while (true);

         System.out.println("You entered: " + userInput);
         scanner.close();
         return userInput;

     }


     public static long factorial() {
         System.out.println("Enter a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();

                 for (int i = 1; i <= num; i++ ) {
                     System.out.printf("%-1d! = %-1d \n", i, num * i);
                 }
                     return num;
     }

     public static int generateRandomNumber(int sides) {
        double randomNumber = (int) (Math.random() * sides + 1);
        return  (int) randomNumber;
     }

     public static int rollDice() {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter number of dice sides");

         int sides = scanner.nextInt();
         double dice1 = Math.round(generateRandomNumber(sides));
         int dice1s = (int) dice1;
         double dice2 = Math.round(generateRandomNumber(sides));
         int dice2s = (int) dice2;

         System.out.println("Roll the dice. Y/N");
         String rollDice = scanner.next();

        if (rollDice.equalsIgnoreCase("Y")){
         System.out.println(dice1s + " " + dice2s);

        } else {
            System.out.println("Ok then.");
            return sides;
        }
            System.out.println("Roll again? Y/N");
            String rollAgain = scanner.next();

            if (rollAgain.equalsIgnoreCase("Y")){
                rollDice();
            } else {
                System.out.println("Thanks for playing.");
            }
         return sides;
     }




}



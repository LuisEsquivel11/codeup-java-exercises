import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {



        // 1 =============
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i += 1;
//        }

        //=================== b ==========================

//        int x = 0;
//
//        do {
//            System.out.println(x);
//            x += 2;
//        }while(x <= 100);

        // ====================== c =============================
//
//        for (int i = 5; i <= 15; i+= 5) {
//            System.out.println(i);
//        }

//        for (int x = 0; x <= 100; x+= 2) {
//            System.out.println(x);
//        }

        // 2 ===============

//        for (int i = 0; i <= 100; i++ ) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // 3 ====================
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userNumber = scanner.nextInt();

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= userNumber; i++) {
           int squared = i * i;
           int cubed = i * i * i;
            System.out.printf("%-7d|%-8d |%-9d\n",i, squared, cubed);

        }

        // 4.
        System.out.println("Enter your grade 0-100");
        int grade = scanner.nextInt();

            if (grade == 100 || grade == 99) {
                System.out.println("A+");
            } else if (grade >= 88 && grade < 99) {
                System.out.println("A");
            } else if (grade > 80 && grade < 87) {
                System.out.println("B");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("C");
            } else if (grade > 60 && grade <= 66) {
                System.out.println("D");
            } else if (grade > 0 && grade <= 59) {
                System.out.println("F");
            } else {
                System.out.println("Invalid grade, try again.");

            }




    }
}

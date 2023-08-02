import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask me if I give a...");
           String input = scanner.nextLine();
           char inputType = input.charAt(input.length() - 1);
           String punctuation = String.valueOf(inputType);

           String response = switch (punctuation) {
               case "?" -> "Sure";
               case "!" -> "Whoa, chill tf out!";
               case " " -> "Fine. Be like that, stupid.";
               default -> "Whatever";
           };

        System.out.println(response);

    }
}

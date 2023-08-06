package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

//        System.out.println("Say something");
//        String response = input.getString();
//        System.out.println(response);
//
//        System.out.println("Yes or no");
//        boolean answer = input.yesNo();
//        System.out.println(answer);

        System.out.println("Enter an integer between 1 and 10");
        int userNum = input.getInt(1, 10);
        System.out.println(userNum);

    }
}

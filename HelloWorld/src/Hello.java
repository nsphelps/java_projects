import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isAlien;

        System.out.println("What is your name?");

        String userInput = sc.nextLine();

        if (userInput.equals("Nick"))
            isAlien = false;
        else isAlien = true;

        if (!isAlien) {
            System.out.println("Ah! Hello, Nick!");
            System.out.println("Your are not an alien!");
        }
        else if (isAlien) {
            System.out.println(userInput + "? I don't know you!");
            System.out.println("You must be an alien!!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You did not get the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than the second top score, but less than 100!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Testing logical OR operator");
        }
        else {
            System.out.println("You didn't even make it to number 2....");
        }

        // Ternary operator
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This is a domestic car");
        }
        else {
            System.out.println("This is not a domestic car");
        }
    }
}

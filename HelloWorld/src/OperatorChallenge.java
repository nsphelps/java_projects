// This challenge is intended to reinforce learning on Java Operators and their
// precedent. Additionally, there are the following seven steps to this challenge:
// 1. Create a double variable with the value of 20.00
// 2. Create a second variable of type double with the value of 80.00
// 3. Add both numbers together, then multiply by 100.00
// 4. Use the remainder operator (modulus), to figure out what the remainder from
//    the result of the operation in step three, and 40.00, will be
// 5. Create a boolean variable that assigns the value true, if the remainder in
//    step four is 0.00, or false if not zero
// 6. Output the boolean variable just to see what the result is
// 7. Write an if-then statement that displays the message, 'got a remainder', if
//    the boolean in step five is not true

import java.util.*;

public class OperatorChallenge {
    public static void main(String[] args) {
        // Step 1
        double x = 20.00;

        // Step 2
        double y = 80.00;

        // Step 3
        double z = (x + y) * 100.00;

        System.out.println(z);  // Printing z to show that operator precedent occurred as expected

        // Step 4
        z = z % 40.00;

        System.out.println(z);  // Printing out to verify remainder

        // Step 5
        boolean noRemainder = (z == 0) ? true : false;

        // Step 6
        System.out.println(noRemainder);

        // Step 7
        if (!noRemainder) {
            System.out.println("got a remainder");
        }
    }
}
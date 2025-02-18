package fundamentals;

import java.util.Scanner;

public class LocialOperators {
    public static void main(String[] args) {

        /* Used to connect two or more expressions
         *
         * && = (AND) Both conditions must be true
         * || = (OR) Either condition must be true
         * ! = (NOT) reverses boolean value of condition
         *
         */

        // &&

        int temp = 35;

        if (temp > 30) {
            System.out.println("It is hot outside!");
        } else if (temp >= 20 && temp<= 30) {
            System.out.println("It is warm outside!");
        } else {
            System.out.println("It is not cold outside!");
        }

        // || !

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playling a game! Press q or Q to exit.");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game!");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }

        // !

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*");
        } else {
            System.out.println("You quit the game!");
        }


    }
}

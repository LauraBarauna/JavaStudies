package fundamentals;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        // while loop = executes a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        // Verify first and execute after
        while (name.isBlank()) {
            System.out.println("Please enter your name: ");
            name = scanner.nextLine();
        }

        // Execute first and verify after
        do {
            System.out.println("Please enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());

        System.out.println("Your name is " + name);


    }
}

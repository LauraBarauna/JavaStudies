package fundamentals;

// We need to import Scanner from the Java library
import java.util.Scanner;

public class UserInput {
    public static void main(String [] args) {

        // Creating a scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you ? ");
        int age = scanner.nextInt();

        // We need to clean the scanner using scanner.nextLine(), otherwise the scanner for favorite food is going to be empty
        scanner.nextLine();
        System.out.println("What is you favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your favorite food is " + food);

    }
}

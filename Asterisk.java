import java.util.Scanner;
public class Asterisk {
    public static void main(String[] args) {
        // Create a scanner to get input from the user
        Scanner inputScanner = new Scanner(System.in);

        // Read five numbers between 1 and 30
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        // Prompt and validate the first number
        System.out.print("Enter a number between 1 and 30 for bar 1: ");
        number1 = inputScanner.nextInt();
        while (number1 < 1 || number1 > 30) {
            System.out.println("Incorrect. The number should be between 1 and 30.");
            System.out.print("Enter a number between 1 and 30 for bar 1: ");
            number1 = inputScanner.nextInt();
        }

        // Prompt and validate the second number
        System.out.print("Enter a number between 1 and 30 for bar 2: ");
        number2 = inputScanner.nextInt();
        while (number2 < 1 || number2 > 30) {
            System.out.println("Incorrect. The number should be between 1 and 30.");
            System.out.print("Enter a number between 1 and 30 for bar 2: ");
            number2 = inputScanner.nextInt();
        }

        // Prompt and validate the third number
        System.out.print("Enter a number between 1 and 30 for bar 3: ");
        number3 = inputScanner.nextInt();
        while (number3 < 1 || number3 > 30) {
            System.out.println("Incorrect. The number should be between 1 and 30.");
            System.out.print("Enter a number between 1 and 30 for bar 3: ");
            number3 = inputScanner.nextInt();
        }

        // Prompt and validate the fourth number
        System.out.print("Enter a number between 1 and 30 for bar 4: ");
        number4 = inputScanner.nextInt();
        while (number4 < 1 || number4 > 30) {
            System.out.println("Incorrect. The number should be between 1 and 30.");
            System.out.print("Enter a number between 1 and 30 for bar 4: ");
            number4 = inputScanner.nextInt();
        }

        // Prompt and validate the fifth number
        System.out.print("Enter a number between 1 and 30 for bar 5: ");
        number5 = inputScanner.nextInt();
        while (number5 < 1 || number5 > 30) {
            System.out.println("Incorrect. The number should be between 1 and 30.");
            System.out.print("Enter a number between 1 and 30 for bar 5: ");
            number5 = inputScanner.nextInt();
        }

        // Close the scanner
        inputScanner.close();

        // Print the asterisk bars for each number
        System.out.println("\nBar Chart:");
        
        // Print bar for number 1
        for (int i = 0; i < number1; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print bar for number 2
        for (int i = 0; i < number2; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print bar for number 3
        for (int i = 0; i < number3; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print bar for number 4
        for (int i = 0; i < number4; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print bar for number 5
        for (int i = 0; i < number5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
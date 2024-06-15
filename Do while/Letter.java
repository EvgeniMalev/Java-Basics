/**
A program in Java, where the user enters a
letter and is told its code and its uppercase or lowercase letter accordingly
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;
        char convertedChar;
        String continueOption;

        do {
            System.out.print("Enter a letter: ");
            inputChar = scanner.next().charAt(0);

            if (Character.isLowerCase(inputChar)) {
                convertedChar = Character.toUpperCase(inputChar);
                System.out.println("The corresponding uppercase letter is: " + convertedChar + " and its ASCII code is: " + (int) convertedChar);
            } else if (Character.isUpperCase(inputChar)) {
                convertedChar = Character.toLowerCase(inputChar);
                System.out.println("The corresponding lowercase letter is: " + convertedChar + " and its ASCII code is: " + (int) convertedChar);
            } else {
                System.out.println("Invalid input. Please enter a letter.");
            }

            System.out.print("Do you want to continue? (y/n): ");
            continueOption = scanner.next();
        } while (continueOption.equalsIgnoreCase("y"));

        scanner.close();
    }
}

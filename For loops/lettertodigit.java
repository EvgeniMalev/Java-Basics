import java.util.Scanner;

public class LetterToIntConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter letters: ");
        String input = scanner.nextLine().toLowerCase();  
        StringBuilder numberString = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c < 'a' || c > 'z') {
                System.out.println("Invalid input! Only letters are allowed.");
                break;  
            }
            int value = c - 'a' + 1;  
            numberString.append(value);

            if (value % 2 == 0) {
                continue;  
            }
            System.out.println("Processed: " + c + " -> " + value);
        }

        System.out.println("Final number: " + numberString);
        scanner.close();
    }
}

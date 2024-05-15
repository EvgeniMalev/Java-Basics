import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int trailingZeroes = 0;
        int powerOf5 = 1;

        while (num / powerOf5 > 0) {
            powerOf5 *= 5;
            trailingZeroes += num / powerOf5;
        }

        System.out.printf("Trailing zeroes: %d\n", trailingZeroes);
    }
}

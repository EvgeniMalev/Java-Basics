import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year the building was constructed: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the primary material used (wood, stone, or steel): ");
        String material = scanner.nextLine().toLowerCase();

        String era = identifyEra(year, material);
        System.out.println("The architectural era is: " + era);

    }

    public static String identifyEra(int year, String material) {
        if (year < 500 && material.equals("stone")) {
            return "Ancient";
        } else if (year >= 500 && year <= 1500 && material.equals("stone")) {
            return "Medieval";
        } else if (year >= 1500 && year <= 1800 && material.equals("wood")) {
            return "Colonial";
        } else if (year >= 1800 && year <= 1900 && material.equals("steel")) {
            return "Industrial";
        } else if (year > 1900 && material.equals("steel")) {
            return "Modern";
        } else {
            return "Uncertain";
        }
    }
}

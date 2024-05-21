import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] prices = {
            {0.50, 0.80, 1.20, 1.45, 1.60}, 
            {0.40, 0.70, 1.15, 1.30, 1.50}, 
            {0.45, 0.70, 1.10, 1.35, 1.55}  
        };
        
        String[] cities = {"Sofia", "Plovdiv", "Varna"};
        String[] products = {"tea", "water", "juice", "sweets", "chips"};

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the product: ");
        String product = scanner.nextLine();
        
        System.out.print("Enter the city: ");
        String city = scanner.nextLine();
        
        System.out.print("Enter the quantity: ");
        double quantity = scanner.nextDouble();
        
        int cityIndex = -1;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equalsIgnoreCase(city)) {
                cityIndex = i;
                break;
            }
        }
        
        int productIndex = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(product)) {
                productIndex = i;
                break;
            }
        }
        
        if (cityIndex != -1 && productIndex != -1) {
            double price = prices[cityIndex][productIndex];
            double totalCost = price * quantity;
            System.out.printf("The total cost for %.2f units of %s in %s is: %.2f%n", quantity, product, city, totalCost);
        } else {
            System.out.println("Invalid city or product.");
        }
        
        scanner.close();
    }
}

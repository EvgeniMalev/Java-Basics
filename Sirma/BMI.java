import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        double BMI = weight / height; 
    
        System.out.printf("The BMI is = %.2f\n", BMI);
    }
}

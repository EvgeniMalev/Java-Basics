import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        
        double d1 = Math.sqrt(b*b - 4*a*c);
 
        double x1 = ((-b - d1)/(2*a));
 
        double x2 = ((-b + d1)/(2*a));
       
 
        System.out.println(x1);
        System.out.println(x2);
    }
}

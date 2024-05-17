import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        
        minutes += 15;
        
        if (minutes >= 60) {
            minutes -= 60;
            hours += 1;
        }
        
        if (hours >= 24) {
            hours -= 24;
        }
        
        String formattedMinutes = String.format("%02d", minutes);
        
        System.out.println(hours + ":" + formattedMinutes);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter initial money");
        double initialmoney = Double.parseDouble(scan.nextLine());
        System.out.println("Enter number of wining lottery tickets");
        int winninglotterytickets = Integer.parseInt(scan.nextLine());
        double totalmoney = 0;
        double ticketsprice = 0;
        double moneyfromtickets = 2.5;
        System.out.println("Enter prive of tram ticket");
        double tramticket = Double.parseDouble(scan.nextLine());
        System.out.println("Enter prive of subway ticket");
        double subwayticket = Double.parseDouble(scan.nextLine());
        System.out.println("Enter prive of bus ticket");
        double busticket = Double.parseDouble(scan.nextLine());
        totalmoney = initialmoney + moneyfromtickets;
        ticketsprice = tramticket + subwayticket + busticket;

        if (winninglotterytickets > 1) {
            moneyfromtickets += 2.9;
        }
        
        if (totalmoney > ticketsprice) {
            System.out.println("You can travel!");
        } else {
            System.out.println("Not enaught money!");
        }
        System.out.println(moneyfromtickets);
        System.out.println(totalmoney);
        System.out.println(ticketsprice);
    }
}

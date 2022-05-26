import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameCompany = scanner.nextLine();
        int countAdultsTickets = Integer.parseInt(scanner.nextLine());
        int countKidsTickets = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double priceService = Double.parseDouble(scanner.nextLine());

        double kidsTicketPrice = adultTicketPrice * 0.30;
        double totalKidsTicketPrice = kidsTicketPrice + priceService;
        double totalAdultTicketPrice = adultTicketPrice + priceService;
        double totalPrice = (countAdultsTickets * totalAdultTicketPrice) + (countKidsTickets * totalKidsTicketPrice);
        double profit = totalPrice*0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameCompany, profit);
    }
}

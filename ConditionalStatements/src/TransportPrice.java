import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int distance = Integer.parseInt(scanner.nextLine());
        String dayNight = scanner.nextLine();

       double dayTaxi = (distance * 0.79) + 0.70;
       double nightTaxi = (distance * 0.90) + 0.70;
       double priceBus = distance * 0.09;
       double priceTrain = distance * 0.06;

       double priceTransport = 0;
       if (distance >=100) {
           priceTransport = priceTrain;
       } else if (distance >= 20) {
           priceTransport = priceBus;
       } else if (dayNight.equals("day")){
           priceTransport = dayTaxi;
       } else if (dayNight.equals("night")){
           priceTransport = nightTaxi;
       }
       System.out.printf("%.2f", priceTransport);
    }
}

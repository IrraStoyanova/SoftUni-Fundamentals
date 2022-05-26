import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double totalPriceAp = 0;
        double totalPriceStudio = 0;


        if (month.equals("May") || month.equals("October")){
            totalPriceStudio = nights * 50.00;
            totalPriceAp = nights * 65.00;
            if (nights > 7 && nights <= 14){
                totalPriceStudio = nights * (50.00 * 0.95);

            } else if (nights > 14) {
                totalPriceStudio = nights * (50.00 * 0.70);
                totalPriceAp = nights * (65.00 * 0.90);
            }
            System.out.printf("Apartment: %.2f lv.%n Studio: %.2f lv.", totalPriceAp, totalPriceStudio);

        } else if (month.equals("June") || month.equals("September")){

            totalPriceStudio = nights * 75.20;
            totalPriceAp = nights * 68.70;
            if (nights> 14){
                totalPriceStudio = nights * (75.20 * 0.80);
                totalPriceAp = nights * (68.70 * 0.90);
            }
            System.out.printf ("Apartment: %.2f lv.%n Studio: %.2f lv.", totalPriceAp, totalPriceStudio);

        } else if (month.equals("July") || month.equals("August")){
            totalPriceStudio = nights * 76.00;
            totalPriceAp = nights * 77.00;
            if (nights > 14){
                totalPriceAp = nights * (77.00 * 0.90);
            }
            System.out.printf ("Apartment: %.2f lv.%n Studio: %.2f lv.", totalPriceAp, totalPriceStudio);
        }

    }
}

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rate = scanner.nextLine();

        int nightsStay = daysStay - 1;
        double priceStay = 0;
        double priceTotalStay = 0;
        if (typeRoom.equals("room for one person")) {
            priceTotalStay = nightsStay * 18.00;

        } else if (typeRoom.equals("apartment")) {

            if (nightsStay > 15) {
                priceStay = nightsStay * 25.00;
                priceTotalStay = priceStay * 0.50;
            } else if (nightsStay >= 10) {
                priceStay = nightsStay * 25.00;
                priceTotalStay = priceStay * 0.65;
            }
            if (nightsStay < 10) {
                priceStay = nightsStay * 25.00;
                priceTotalStay = priceStay * 0.70;
            }
        } else if (typeRoom.equals("president apartment")) {
            if (nightsStay > 15) {
                priceStay = nightsStay * 35.00;
                priceTotalStay = priceStay * 0.80;
            } else if (nightsStay >= 10) {
                priceStay = nightsStay * 35.00;
                priceTotalStay = priceStay * 0.85;
            } else if (nightsStay < 10) {
                priceStay = nightsStay * 35.00;
                priceTotalStay = priceStay * 0.90;
            }


        }

        if (rate.equals("negative")) {
            priceTotalStay = priceTotalStay * 0.90;
        } else if (rate.equals("positive")) {
            priceTotalStay = priceTotalStay * 1.25;
        }

        System.out.printf("%.2f", priceTotalStay);
    }
}





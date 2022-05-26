import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeAcc = scanner.nextLine();
        String rating = scanner.nextLine();

        double totalPrice = 0;
        double totalPriceWithDisc = 0;
        double finalPrice = 0;

        if (typeAcc.equals("room for one person")) {
            totalPrice = (days - 1) * 18.00;
            if (rating.equals("positive")) {
                finalPrice = totalPrice + (totalPrice * 0.25);
            } else if (rating.equals("negative")) {
                finalPrice = totalPrice - (totalPrice * 0.10);
            }
            System.out.printf("%.2f",finalPrice);

        } else if (typeAcc.equals("apartment")){
            if (days<10){
                totalPrice = (days - 1) * 25;
                totalPriceWithDisc = totalPrice - (0.30 * totalPrice);

            } else if (days >=10 && days <= 15){
                totalPrice = (days -1 ) * 25;
                totalPriceWithDisc = totalPrice - (0.35 * totalPrice);
            } else if (days > 15){
                totalPrice = (days -1) * 25;
                totalPriceWithDisc = totalPrice - (0.50 * totalPrice);
            }
            if (rating.equals("positive")) {
                finalPrice = totalPriceWithDisc + (totalPriceWithDisc * 0.25);
            } else if (rating.equals("negative")) {
                finalPrice = totalPriceWithDisc - (totalPriceWithDisc * 0.10);
            }
            System.out.printf("%.2f",finalPrice);


        } else if (typeAcc.equals("president apartment")){
            if (days<10){
                totalPrice = (days - 1) * 35;
                totalPriceWithDisc = totalPrice - (0.10 * totalPrice);

            } else if (days >=10 && days <= 15){
                totalPrice = (days -1 ) * 35;
                totalPriceWithDisc = totalPrice - (0.15 * totalPrice);
            } else if (days > 15){
                totalPrice = (days -1) * 35;
                totalPriceWithDisc = totalPrice - (0.20 * totalPrice);
            }
            if (rating.equals("positive")) {
                finalPrice = totalPriceWithDisc + (totalPriceWithDisc  * 0.25);
            } else if (rating.equals("negative")) {
                finalPrice = totalPriceWithDisc - (totalPriceWithDisc * 0.10);
            }
            System.out.printf("%.2f",finalPrice);



        }
    }
}

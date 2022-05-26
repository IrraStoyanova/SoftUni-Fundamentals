import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaning = Integer.parseInt(scanner.nextLine());
        double pensCost = pens * 5.80;
        double markersCost = markers * 7.20;
        double cleaningCost = cleaning * 1.20;
        double costWithoutDiscount = pensCost + markersCost + cleaningCost;
        double discount = Double.parseDouble(scanner.nextLine());
        double DiscountPrice = costWithoutDiscount * discount/100;
        double totalPriceWithDiscount = costWithoutDiscount - DiscountPrice;

        System.out.println(totalPriceWithDiscount);


    }
}

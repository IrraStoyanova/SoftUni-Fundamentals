import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int magnolia = Integer.parseInt(scanner.nextLine());
        int zumbul = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double totalMagnolia = magnolia * 3.25;
        double totalZumbul = zumbul * 4.00;
        double totalRoses = roses * 3.50;
        double totalCactus = cactus * 8.00;

        double allCost = totalCactus + totalRoses + totalMagnolia + totalZumbul;
        double tax = allCost * 0.05;
        double earnLeft = allCost - tax;

        double diff = Math.abs(earnLeft - pricePresent);

        if (earnLeft >= pricePresent) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }
    }
}

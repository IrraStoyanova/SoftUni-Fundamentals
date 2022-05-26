import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double priceVideoCards = videoCards * 250;
        double priceProcessorsOne = priceVideoCards * 0.35;
        double priceRamOne = priceVideoCards * 0.10;

        double totalPriceAll = priceVideoCards + (processors * priceProcessorsOne) + (ram * priceRamOne);

        if (videoCards > processors ) {
            totalPriceAll = totalPriceAll - (totalPriceAll * 0.15);
        }

        double diff = Math.abs(budget - totalPriceAll);
        if (totalPriceAll <= budget) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf ("Not enough money! You need %.2f leva more!", diff);
        }


    }
}

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble (scanner.nextLine());
        int numberStat = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double totalClothesPrice = numberStat*priceClothes;

        if (numberStat > 150) {
            totalClothesPrice = totalClothesPrice -(totalClothesPrice * 0.10);
        }

        double totalCost = decorPrice + totalClothesPrice;
        double diff = Math.abs(budget - totalCost);

        if (totalCost <= budget) {
            System.out.printf("Action! %nWingard starts filming with %.2f leva left.", diff);

        } else {
            System.out.printf("Not enough money! %nWingard needs %.2f leva more.", diff);
        }
        }
}

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceJourney = Double.parseDouble(scanner.nextLine());
        int numberPuzzles = Integer.parseInt(scanner.nextLine());
        int numberDolls = Integer.parseInt(scanner.nextLine());
        int numberTeddyBear = Integer.parseInt(scanner.nextLine());
        int numberMinions = Integer.parseInt(scanner.nextLine());
        int numberTrucks = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = numberPuzzles * 2.60;
        double dollsPrice = numberDolls * 3.00;
        double teddyBearPrice = numberTeddyBear * 4.10;
        double minionPrice = numberMinions * 8.20;
        double trucksPrice = numberTrucks *2.00;

        double totalPrice = puzzlePrice + dollsPrice + teddyBearPrice + minionPrice + trucksPrice;
        int totalNumber = numberDolls +numberPuzzles + numberTeddyBear + numberMinions + numberTrucks;


        if (totalNumber >= 50) {
            totalPrice = totalPrice * 0.75;

        }

        totalPrice = totalPrice - (totalPrice * 0.10);

        double diff = Math.abs(totalPrice - priceJourney);
        if (totalPrice >= priceJourney) {
            System.out.printf("Yes! %.02f lv left.", diff);

        } else {
            System.out.printf("Not enough money! %.02f lv needed.", diff);
        }
    }
}

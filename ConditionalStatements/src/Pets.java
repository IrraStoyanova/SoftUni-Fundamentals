import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int leftFoodKg = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDayGram = Double.parseDouble(scanner.nextLine());

        double dogFoodTotal = days * dogFoodPerDay;
        double catFoodTotal =days * catFoodPerDay;
        double turtleFoodTotalGrams = days * turtleFoodPerDayGram;
        double turtleFoodTotal = turtleFoodTotalGrams/1000;

        double totalFoodNeeded = dogFoodTotal + catFoodTotal + turtleFoodTotal;


        double diff = Math.abs(totalFoodNeeded - leftFoodKg);

        if (totalFoodNeeded > leftFoodKg) {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        } else {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        }


    }
}

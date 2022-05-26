import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grapesPerMeter = Double.parseDouble(scanner.nextLine());
        int wineLitre = Integer.parseInt(scanner.nextLine());
        int workersNumber = Integer.parseInt(scanner.nextLine());

        double grapesTotal = area * grapesPerMeter;
        double grapesForWine = grapesTotal * 0.40;
        double totalWineProduced = grapesForWine/2.5;

        double diff = Math.abs(totalWineProduced - wineLitre);

        if (totalWineProduced >= wineLitre) {
            double winePerWorker = diff/workersNumber;
            System.out.printf ("Good harvest this year! Total wine: %.0f liters. %n %.0f liters left -> %.0f liters per person.", Math.floor(totalWineProduced), Math.ceil(diff),Math.ceil(winePerWorker));


        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(diff));
        }

    }
}

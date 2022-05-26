import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
        //•	Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
        //•	Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
        //•	Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
        //•	Пети ред – килограма миди. Цяло число в интервала [0 ... 100]

        double fishSkumPrice = Double.parseDouble(scanner.nextLine());
        double fishCacaPrice = Double.parseDouble(scanner.nextLine());
        double fishPalamudKg = Double.parseDouble(scanner.nextLine());
        double fishSafridKg = Double.parseDouble(scanner.nextLine());
        int shelfKg = Integer.parseInt(scanner.nextLine());

        double palamudPrice = fishSkumPrice * 1.6;
        double safridPrice = fishCacaPrice *1.8;
        double shelfPrice = 7.50;

        double palamudTotalPrice = fishPalamudKg * palamudPrice;
        double safridTotalPrice = fishSafridKg * safridPrice;
        double shelfTotalPrice = shelfKg * shelfPrice;

        double totalPay = palamudTotalPrice + safridTotalPrice + shelfTotalPrice;
        System.out.printf("%.2f", totalPay);


    }
}

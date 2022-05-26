import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double spentMoney = 0;

        if (budget <= 100) {
            if (season.equals("summer")){
                spentMoney = budget * 0.30;
                System.out.printf("Somewhere in Bulgaria %n Camp - %.2f", spentMoney);

            } else if (season.equals("winter")){
                spentMoney = budget * 0.70;
                System.out.printf("Somewhere in Bulgaria %n Hotel - %.2f", spentMoney);
            }

        } else if (budget > 100 && budget <=1000){
            if (season.equals("summer")){
                spentMoney = budget * 0.40;
                System.out.printf("Somewhere in Balkans %n Camp - %.2f", spentMoney);
            } else if (season.equals("winter")){
                spentMoney = budget * 0.80;
                System.out.printf("Somewhere in Balkans %n Hotel - %.2f", spentMoney);
            }

        } else if (budget > 1000){
            if (season.equals("summer")) {
                spentMoney = budget * 0.90;
                System.out.printf("Somewhere in Europe %n Hotel - %.2f", spentMoney);
            } else if (season.equals("winter")){
                spentMoney = budget * 0.90;
                System.out.printf("Somewhere in Europe %n Hotel - %.2f",spentMoney);
            }

        }
    }
}

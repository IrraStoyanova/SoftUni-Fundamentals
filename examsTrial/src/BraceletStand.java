import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyDay = Double.parseDouble(scanner.nextLine());
        double moneyEarnedPerDay = Double.parseDouble(scanner.nextLine());
        double expensesAllPeriod = Double.parseDouble(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double totalSavedMoney = 5 * moneyDay;
        double totalEarned = 5*moneyEarnedPerDay;
        double totalAll = (totalSavedMoney + totalEarned) - expensesAllPeriod;
        double diff = Math.abs(pricePresent - totalAll);

        if (totalAll >= pricePresent){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", totalAll);
        } else if (totalAll < pricePresent){
            System.out.printf("Insufficient money: %.2f BGN.", diff);

        }

    }
}

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        double totalMoney = availableMoney;
        int countSpendDays = 0;
        int totalDays = 0;
        boolean wasFailed = false;


        while(totalMoney < neededMoney){
            if (countSpendDays >= 5){
                wasFailed = true;
                break;
            }
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            totalDays++;



            if(action.equals("spend")){
                totalMoney = totalMoney - amount;
                countSpendDays++;
                if (totalMoney < 0){
                    totalMoney = 0;
                }
            } else if (action.equals("save")){
                countSpendDays = 0;
                totalMoney = totalMoney + amount;
            }

        }
        if(wasFailed) {
            System.out.printf ("You can't save the money.%n%d", totalDays);

        } else {
            System.out.printf ("You saved the money for %d days.", totalDays);
        }
    }
}

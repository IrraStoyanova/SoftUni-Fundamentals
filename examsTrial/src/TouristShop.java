import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();
        int countProduct = 0;
        double spentMoney = 0;

        while(!command.equals("Stop")) {
            String typeProduct = command;
            double priceProduct = Double.parseDouble(scanner.nextLine());
            countProduct++;
            if (countProduct % 3 == 0) {
                priceProduct = priceProduct * 0.5;
            }
            spentMoney = spentMoney + priceProduct;
            if (spentMoney > budget){
                break;
            }
            command = scanner.nextLine();

        }

            double diff = Math.abs(budget - spentMoney);

            if (spentMoney > budget){
                System.out.printf("You don't have enough money!%n");
                System.out.printf("You need %.2f leva!",diff);
            } else {
                System.out.printf("You bought %d products for %.2f leva.",countProduct,spentMoney);
            }


        }
    }


import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expectedSum = Integer.parseInt(scanner.nextLine());
        int countCycle = 0;
        int successfulTransactionCash = 0;
        int successfulTransactionCard = 0;
        int countCash = 0;
        int countCard = 0;

        String command = scanner.nextLine();

        while(!command.equals("End")){
            int priceProduct = Integer.parseInt(command);
            countCycle++;

            if (countCycle % 2 == 0){
                if (priceProduct < 10){
                    System.out.println("Error in transaction!");
                } else {
                    countCard++;
                    successfulTransactionCard = successfulTransactionCard + priceProduct;
                    System.out.println ("Product sold!");
                }
            } else {
                if (priceProduct > 100){
                    System.out.println("Error in transaction!");
                } else {
                    countCash++;
                    successfulTransactionCash = successfulTransactionCash + priceProduct;
                    System.out.println ("Product sold!");
                }
            }
            if (successfulTransactionCard + successfulTransactionCash >= expectedSum){
                System.out.printf("Average CS: %.2f%n", (successfulTransactionCash * 1.00) /countCash);
                System.out.printf("Average CC: %.2f%n", (successfulTransactionCard * 1.00)/countCard);
                break;
            }
            command = scanner.nextLine();
        }

        if (command.equals("End")){
            System.out.println("Failed to collect required money for charity.");
        }


    }





        }





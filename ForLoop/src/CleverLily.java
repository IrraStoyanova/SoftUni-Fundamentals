import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int oddYar = 0;
        int eventYar = 0;
        double totalSum = 0;
        double totalMoney = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                sum = sum + 10;
                totalSum = totalSum + sum;
                eventYar++;
            } else {
                oddYar++;
            }
        } totalMoney = totalSum + (oddYar * priceToy * 1.0) - eventYar;
          if (totalMoney >= priceWashingMachine){
              System.out.printf("Yes! %.2f", totalMoney - priceWashingMachine);
          } else {
              System.out.printf("No! %.2f", priceWashingMachine - totalMoney);
          }
    }
}

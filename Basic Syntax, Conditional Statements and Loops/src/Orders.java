import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double endSum = 0;

        for (int i = 0; i <ordersCount ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double totalSum = (days*capsulesCount)*pricePerCapsule;
            endSum += totalSum;

            System.out.printf("The price for the coffee is: $%.2f%n", totalSum);

        }

        System.out.printf("Total: $%.2f", endSum);
    }
}

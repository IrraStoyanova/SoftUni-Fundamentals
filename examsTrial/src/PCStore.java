import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceProcessor = Double.parseDouble(scanner.nextLine());
        double priceVideoCard = Double.parseDouble(scanner.nextLine());
        double priceRamMemory = Double.parseDouble(scanner.nextLine());
        int countRamMemory = Integer.parseInt(scanner.nextLine());
        double percentDiscount = Double.parseDouble(scanner.nextLine());

        double priceProcessorLv = priceProcessor * 1.57;
        double priceVideoCardLv = priceVideoCard * 1.57;
        double priceRamMemoryLv = (priceRamMemory * 1.57) * countRamMemory;

        double priceProcessorDisc = priceProcessorLv - (priceProcessorLv * percentDiscount);
        double priceVideoCardDisc = priceVideoCardLv - (priceVideoCardLv * percentDiscount);

        double totalPrice = priceProcessorDisc + priceVideoCardDisc + priceRamMemoryLv;

        System.out.printf("Money needed - %.2f leva.", totalPrice);



    }
}

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananaKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double redberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());

        //•	цената на малините е на половина по-ниска от тази на ягодите;
        //•	цената на портокалите е с 40% по-ниска от цената на малините;
        //•	цената на бананите е с 80% по-ниска от цената на малините.

        double priceRedberries = strawberriesPrice*0.5;
        double orangePrice = priceRedberries * 0.6;
        double bananaPrice = priceRedberries*0.2;

        double totalSum = (strawberriesKg*strawberriesPrice) + (bananaKg*bananaPrice) + (redberriesKg*priceRedberries)+ (orangePrice*orangesKg);

        System.out.printf("%.2f",totalSum);

    }
}

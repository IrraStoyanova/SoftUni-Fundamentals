import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        int yearTax = Integer.parseInt(scanner.nextLine());
        double shoes = yearTax * 0.60;
        double suit = shoes * 0.80;
        double ball = suit/4;
        double accessories = ball/5;
        double totalCosts = yearTax + shoes + suit + ball + accessories;

        System.out.println(totalCosts);

    }
}

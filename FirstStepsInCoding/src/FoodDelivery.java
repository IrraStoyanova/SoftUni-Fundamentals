import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veggieMenu = Integer.parseInt(scanner.nextLine());
        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.

        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double veggiePrice = veggieMenu * 8.15;
        double allCostMenu = chickenPrice + fishPrice + veggiePrice;
        double dessertPrice = allCostMenu * 0.20;
        double delivery = 2.50;

        System.out.println(allCostMenu + dessertPrice + delivery);



    }
}

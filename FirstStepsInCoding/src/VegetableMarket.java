import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]

        double vegetablesKg = Double.parseDouble(scanner.nextLine());
        double fruitsKg = Double.parseDouble(scanner.nextLine());
        int allKgVegetables = Integer.parseInt(scanner.nextLine());
        int allKgFruits = Integer.parseInt(scanner.nextLine());

        double vegetablesPrice = vegetablesKg * allKgVegetables;
        double fruitsPrice = fruitsKg * allKgFruits;
        double allPrice = vegetablesPrice + fruitsPrice;

        double resultEuro = allPrice/1.94;
        System.out.printf("%.2f", resultEuro);


    }
}

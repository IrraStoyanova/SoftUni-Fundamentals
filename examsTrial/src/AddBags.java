import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceLuggage = Double.parseDouble(scanner.nextLine());
        double kilogramLuggage = Double.parseDouble(scanner.nextLine());
        int daysToTravel = Integer.parseInt(scanner.nextLine());
        int countLuggage = Integer.parseInt(scanner.nextLine());

        //Таксите за багаж се изчисляват въз основа на теглото на чекирания багаж:
        //•	до 10кг – 20% от цената на багаж над 20кг
        //•	между 10кг и 20кг вкл. – 50% от цената на багаж над 20кг.
        //•	над 20кг – таксата се чете от конзолата
        double priceOver = 0;

        if (kilogramLuggage < 10){
            priceOver = priceLuggage * 0.20;
        } else if (kilogramLuggage>= 10 && kilogramLuggage <=20){
            priceOver = priceLuggage * 0.50;
        } else if (kilogramLuggage > 20){
            priceOver = priceLuggage;
        }

        double priceWithDays = 0;
        //В зависимост от броя на дните, които остават до пътуването, цената се оскъпява:
        //•	повече от 30 дни - цената на багажа се оскъпява с 10%
        //•	между 7 и 30 дни вкл. - цената на багажа се оскъпява с 15%
        //•	по-малко от 7 дни - цената на багажа се оскъпява с 40%
        if (daysToTravel > 30){
            priceWithDays = priceOver + (priceOver* 0.10);
        } else if (7 <= daysToTravel){
            priceWithDays = priceOver + (priceOver * 0.15);
        } else {
            priceWithDays = priceOver + (priceOver * 0.40);
        }
        double totalPriceOver = priceWithDays * countLuggage;
        System.out.printf("The total price of bags is: %.2f lv.", totalPriceOver);

    }
}

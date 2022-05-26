import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());




        //•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%

        double totalPrice = 0;
        switch (flower) {
            case "Roses":
                totalPrice = numberFlowers * 5;
                if (numberFlowers > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;
            case "Dahlias":
                totalPrice = numberFlowers * 3.80;
                if (numberFlowers > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = numberFlowers * 2.80;
                if (numberFlowers > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = numberFlowers * 3;
                if (numberFlowers < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = numberFlowers * 2.50;
                if (numberFlowers < 80) {
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }
                break;
        }
                double diff = Math.abs(totalPrice - budget);
                if (totalPrice <= budget){
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flower, diff);
                } else if (totalPrice > budget){
                    System.out.printf ("Not enough money, you need %.2f leva more.", diff);
                }



    }
}

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//•	Предпазен найлон - 1.50 лв. за кв. метър
//•	Боя - 14.50 лв. за литър
//•	Разредител за боя - 5.00 лв. за литър
        int plastic = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int liquid = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double plasticSum = (plastic +2) * 1.50;
        double paintSum = (paint * 1.10) * 14.50;
        double liquidSum = liquid * 5.00;
        double littlePlasticSum = 0.40;
        double allSum = plasticSum + paintSum + liquidSum + littlePlasticSum;
        double work = (allSum * 0.30) * hours;

        double rezult = allSum + work;

        System.out.println(rezult);


    }
}

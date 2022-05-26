import java.util.Scanner;

public class CatDogFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Dog = Integer.parseInt(scanner.nextLine());
        double pricedog = Dog * 2.50;
        int Cat = Integer.parseInt (scanner.nextLine());
        double pricecat = Cat * 4;
        System.out.println(pricedog + pricecat + " lv");



    }
}

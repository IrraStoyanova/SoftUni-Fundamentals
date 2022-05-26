import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double coinsChange = change * 100;

        int count = 0;

        while(coinsChange>0){
            if (coinsChange>=200){
                coinsChange = coinsChange - 200;
               count++;

            } else if (coinsChange >= 100){
                coinsChange = coinsChange - 100;
                count++;
            } else if (coinsChange>=50){
                coinsChange = coinsChange - 50;
                count++;
            } else if (coinsChange >= 20){
                coinsChange = coinsChange - 20;
                count++;
            } else if (coinsChange >= 10){
                coinsChange = coinsChange - 10;
                count++;
            } else if (coinsChange >= 5){
                coinsChange = coinsChange - 5;
                count++;
            } else if (coinsChange >= 2){
                coinsChange = coinsChange - 2;
                count++;
            } else if (coinsChange >= 1){
                coinsChange = coinsChange - 1;
                count++;
            } else {
                break;
            }


        }
        System.out.println(count);
    }
}

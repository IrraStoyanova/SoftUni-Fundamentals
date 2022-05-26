import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double dieselLitre = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double dieselPrice = dieselLitre*2.10;
        double excursion = 100;
        double totalSpent = dieselPrice + excursion;
        switch (dayOfWeek){
            case "Saturday":
                totalSpent = totalSpent*0.90;
                break;
            case "Sunday":
                totalSpent = totalSpent*0.80;
                break;
        }

        double diff = Math.abs(budget-totalSpent);
        if (budget >= totalSpent){
            System.out.printf("Safari time! Money left: %.2f lv.", diff);

        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }

    }
}

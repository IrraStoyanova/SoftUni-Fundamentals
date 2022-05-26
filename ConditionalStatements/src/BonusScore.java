import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initPoints = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (initPoints <= 100) {
            bonus = bonus + 5;
        }
        else if (initPoints < 1000) {
            bonus = initPoints * 0.20;
        }
        else if (initPoints > 1000) {
            bonus = initPoints * 0.10;
        }

        if ( initPoints % 2 == 0) {
            bonus = bonus + 1;
        }
        if (initPoints % 10 == 5) {
            bonus = bonus + 2;
        }

        double totalPoints = initPoints + bonus;
        System.out.printf ("%.1f%n", bonus);
        System.out.printf("%.1f", totalPoints);

    }
}
